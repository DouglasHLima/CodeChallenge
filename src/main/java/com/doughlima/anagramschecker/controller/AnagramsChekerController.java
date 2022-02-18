package com.doughlima.anagramschecker.controller;

import com.doughlima.anagramschecker.service.AnagramsSubstringChecker;
import com.doughlima.anagramschecker.utils.AnagramsConsoleWriter;

import java.util.Scanner;


public class AnagramsChekerController {
    public void run(){
        Scanner reader = new Scanner(System.in);
        AnagramsSubstringChecker checker = new AnagramsSubstringChecker();

        AnagramsConsoleWriter.WriteInsertionMessage();
        String input = reader.next();

        int numberOfCombinations = checker.numberOfCombinations(input);

        AnagramsConsoleWriter.WriteResults(numberOfCombinations);
    }
}
