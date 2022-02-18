package com.doughlima.passwordchecker.service.validation.rules;


import com.doughlima.passwordchecker.service.validation.ValidationRule;

import java.util.List;
import java.util.stream.IntStream;

/**@author Douglas Lima
 * Rule to check the if input has any special character
 */
public class SpecialCharacterRule implements ValidationRule<char[]> {

    /**
     * list of all special characters that will be tested
     */
    private final List<Character> specialChars = List.of('!','@','#','$','%','^','&','*','(',')','-','+');

    @Override
    public boolean validate(char[] chars) {
        return IntStream.range(0, chars.length)
                .mapToObj(index -> specialChars.contains(chars[index]))
                .reduce(Boolean.FALSE,Boolean::logicalOr);
    }
}
