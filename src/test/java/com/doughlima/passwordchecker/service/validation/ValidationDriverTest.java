package com.doughlima.passwordchecker.service.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationDriverTest{

    ValidationDriver driver = new ValidationDriver();

    @Test
    public void testGetLettersToCompleteOnIncorrectInput() {
        String input = "Ya3";
        int lettersToComplete = driver.getLettersToComplete(input);
        Assertions.assertEquals(3,lettersToComplete);
    }

    @Test
    public void testValidateOnIncorrectInput() {
        String input = "Ya3";
        Boolean validate = driver.validate(input);
        Assertions.assertFalse(validate);
    }

    @Test
    public void testValidateOnValidInput() {
        String input = "Ya3&ab";
        Boolean validate = driver.validate(input);
        Assertions.assertTrue(validate);
    }

    @Test
    public void testGetLettersToCompleteOnValidInput() {
        String input = "Ya3&ab";
        int lettersToComplete = driver.getLettersToComplete(input);
        Assertions.assertEquals(0,lettersToComplete);
    }
}