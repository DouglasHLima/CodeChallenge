package com.doughlima.passwordchecker.service.validation.rules;


import com.doughlima.passwordchecker.service.validation.ValidationRule;

import java.util.stream.IntStream;

public class LowerCaseRule implements ValidationRule<char[]> {

    @Override
    public boolean validate(char[] chars) {
        return IntStream.range(0, chars.length)
                .mapToObj(index -> chars[index] == Character.toLowerCase(chars[index]))
                .reduce(Boolean.FALSE, Boolean::logicalOr);
    }

}
