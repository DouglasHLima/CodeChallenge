package com.doughlima.passwordchecker.service.validation.rules;


import com.doughlima.passwordchecker.service.validation.ValidationRule;

public class LengthRule implements ValidationRule<char[]> {

    public final int LENGTH = 6;

    @Override
    public boolean validate(char[] chars) {
        return chars.length >= LENGTH;
    }

}
