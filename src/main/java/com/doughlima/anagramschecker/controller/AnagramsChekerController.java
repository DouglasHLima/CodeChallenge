package com.doughlima.anagramschecker.controller;

import com.doughlima.anagramschecker.service.AnagramsSubstringChecker;
import com.doughlima.anagramschecker.utils.AnagramsConsoleWriter;

import java.util.Scanner;

/**
 * provides application control logic by reading user input and displaying console values
 * @author Douglas Lima
 * @see AnagramsSubstringChecker
 */
public class AnagramsChekerController {
    public void run(){
        Scanner reader = new Scanner(System.in);
        AnagramsSubstringChecker checker = new AnagramsSubstringChecker();

        AnagramsConsoleWriter.WriteInsertionMessage();
        String input = reader.next();

        int numberOfCombinations = checker.numberOfPossibleAnagrams(input);

        AnagramsConsoleWriter.WriteResults(numberOfCombinations);
    }
}
