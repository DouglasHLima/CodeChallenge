package com.doughlima.passwordchecker.service.validation.rules;


import com.doughlima.passwordchecker.service.validation.ValidationRule;

import java.util.List;
import java.util.stream.IntStream;

public class SpecialCharacterRule implements ValidationRule<char[]> {

    private final List<Character> specialChars = List.of('!','@','#','$','%','^','&','*','(',')','-','+');

    @Override
    public boolean validate(char[] chars) {
        return IntStream.range(0, chars.length)
                .mapToObj(index -> specialChars.contains(chars[index]))
                .reduce(Boolean.FALSE,Boolean::logicalOr);
    }
}
