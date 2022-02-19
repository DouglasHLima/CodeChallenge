package com.doughlima.anagramschecker.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramsSubstringCheckerTest {

    private final AnagramsSubstringChecker checker = new AnagramsSubstringChecker();

    @Test
    public void checkPossibilitiesForOvo() {
        int possibilities = checker.numberOfPossibleAnagrams("ovo");
        Assertions.assertEquals(2, possibilities);
    }

    @Test
    public void checkPossibilitiesForIfailuhkqq() {
        int possibilities = checker.numberOfPossibleAnagrams("ifailuhkqq");
        Assertions.assertEquals(3, possibilities);
    }

}