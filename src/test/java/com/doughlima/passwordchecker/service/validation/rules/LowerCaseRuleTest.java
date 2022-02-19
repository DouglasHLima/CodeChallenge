package com.doughlima.passwordchecker.service.validation.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseRuleTest {

    private final LowerCaseRule rule = new LowerCaseRule();

    @Test
    void validateOnInvalidChars() {
        char[] chars = new char[]{'A','B','C'};
        boolean isValid = rule.validate(chars);
        Assertions.assertFalse(isValid);
    }
    @Test
    void validateOnValidChars() {
        char[] chars = new char[]{'a','B','C'};
        boolean isValid = rule.validate(chars);
        Assertions.assertTrue(isValid);
    }

}