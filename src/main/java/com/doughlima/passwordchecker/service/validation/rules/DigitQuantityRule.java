package com.doughlima.passwordchecker.service.validation.rules;


import com.doughlima.passwordchecker.service.validation.ValidationRule;

import java.util.stream.IntStream;

/**@author Douglas Lima.
 * Rule to check number of digits in input
 */
public class DigitQuantityRule implements ValidationRule<char[]> {

    @Override
    public boolean validate(char[] chars) {
        return IntStream.range(0, chars.length)
                .mapToObj( index -> chars[index] >= '0' && chars[index] <= '9')
                .reduce(Boolean.FALSE,Boolean::logicalOr);
    }
}
