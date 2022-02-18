package com.doughlima.anagramschecker.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnagramsSubstringChecker {

    public int numberOfCombinations(String input) {
        int count = 0;
        List<String> combinations = getCombinations(input);
        List<String> newList = new ArrayList<>(combinations);

        for (String combination : combinations) {
            newList.remove(combination);

            for (String word : newList) {
                if (combination.equals(word)) {
                    count++;
                }
            }
        }
        return count;
    }

    private List<String> getCombinations(String input) {
        List<String> combinations = new ArrayList<>();

        for (int firstDelimiter = 0; firstDelimiter < input.length(); firstDelimiter++) {
            for (int secondDelimiter = firstDelimiter + 1; secondDelimiter <= input.length(); secondDelimiter++){
                char[] combinationChars = input.substring(firstDelimiter, secondDelimiter).toCharArray();
                Arrays.sort(combinationChars);
                combinations.add(new String(combinationChars));
            }
        }
        return combinations;
    }
}
