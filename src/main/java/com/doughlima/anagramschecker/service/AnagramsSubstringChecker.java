package com.doughlima.anagramschecker.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class responsible for generating as many combinations as possible
 * and checking how many of them are anagrams of themselves
 * @author Douglas Lima
 */
public class AnagramsSubstringChecker {

    /**
     * calculates the number of possible anagrams from substrings of a word
     * @param input String - value to be performed
     * @return int - quantity of sub anagrams possibles
     */
    public int numberOfPossibleAnagrams(String input) {
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

    /**
     * divides the word into substrings and returns a list of them
     * @param input String - word to be performed
     * @return List of possibles substrings
     */
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
