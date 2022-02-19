package com.doughlima.passwordchecker.service.validation.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseRuleTest {

    private final UpperCaseRule rule = new UpperCaseRule();

    @Test
    void validateOnInvalidChars() {
        char[] chars = new char[]{'a','b','c'};
        boolean isValid = rule.validate(chars);
        Assertions.assertFalse(isValid);
    }
    @Test
    void validateOnValidChars() {
        char[] chars = new char[]{'A','b','1'};
        boolean isValid = rule.validate(chars);
        Assertions.assertTrue(isValid);
    }

}