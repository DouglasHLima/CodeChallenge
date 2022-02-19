package com.doughlima.passwordchecker.service.validation;

import com.doughlima.passwordchecker.service.validation.rules.*;

import java.util.List;

/**
 * this class stores the validation instances that will be performed in a list
 * and provides a method to execute all of them
 * @author Douglas Lima.
 */
public class ValidationDriver {

    private final LengthRule lengthRule = new LengthRule();

    private final List<ValidationRule<char[]>> characterRules = List.of(
            lengthRule,
            new DigitQuantityRule(),
            new LowerCaseRule(),
            new SpecialCharacterRule(),
            new UpperCaseRule()
    );

    /** validate the entered password
     * @param password String - password to be validate
     * @return Boolean - false for any failure validade or true for all pass.
     */
    public Boolean validate(String password){
        char[] chars = password.toCharArray();
        return characterRules.stream()
                .map(validationRule -> validationRule.validate(chars))
                .reduce(Boolean.TRUE,Boolean::logicalAnd);
    }

    /** checks how many letters have the password entered and how many are left to complete
     * @param password String - password to check
     * @return int - size of missing letters
     */
    public int getLettersToComplete(String password){
        return lengthRule.LENGTH > password.length()?
                lengthRule.LENGTH - password.length()
                : 0;
    }

}
