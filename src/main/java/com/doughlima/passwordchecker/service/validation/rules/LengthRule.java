package com.doughlima.passwordchecker.service.validation.rules;


import com.doughlima.passwordchecker.service.validation.ValidationRule;

/**
 * Rule to check the length of input
 * @author Douglas Lima.
 */
public class LengthRule implements ValidationRule<char[]> {

    /**
     * minimum length for pass in this rule
     */
    public final int LENGTH = 6;

    @Override
    public boolean validate(char[] chars) {
        return chars.length >= LENGTH;
    }

}
