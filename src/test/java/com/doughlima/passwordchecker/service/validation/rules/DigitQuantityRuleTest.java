package com.doughlima.passwordchecker.service.validation.rules;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitQuantityRuleTest {

    private final DigitQuantityRule rule = new DigitQuantityRule();

    @Test
    void validateOnInvalidChars() {
        char[] chars = new char[]{'a','b','c'};
        boolean isValid = rule.validate(chars);
        Assertions.assertFalse(isValid);
    }
    @Test
    void validateOnValidChars() {
        char[] chars = new char[]{'a','b','1'};
        boolean isValid = rule.validate(chars);
        Assertions.assertTrue(isValid);
    }

}