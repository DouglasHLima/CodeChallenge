package com.doughlima.passwordchecker.service.validation;

import com.doughlima.passwordchecker.service.validation.rules.*;

import java.util.List;

public class ValidationDriver {

    private final LengthRule lengthRule = new LengthRule();

    private final List<ValidationRule<char[]>> characterRules = List.of(
            lengthRule,
            new DigitQuantityRule(),
            new LowerCaseRule(),
            new SpecialCharacterRule(),
            new UpperCaseRule()
    );

    public Boolean validate(String password){
        char[] chars = password.toCharArray();
        return characterRules.stream()
                .map(validationRule -> validationRule.validate(chars))
                .reduce(Boolean.TRUE,Boolean::logicalAnd);
    }

    public int getLettersToComplete(String password){
        return lengthRule.LENGTH > password.length()?
                lengthRule.LENGTH - password.length()
                : 0;
    }

}
