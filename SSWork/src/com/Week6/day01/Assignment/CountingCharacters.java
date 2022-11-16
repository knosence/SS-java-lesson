package com.Week6.day01.Assignment;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String testString = "Hello Stormer";

        // Requirements
        HashMap<Character, Integer> characterCount;

        characterCount = countCharacters(testString);
        System.out.println(characterCount);

        // Bonus Challenge
        HashMap<String, Integer> wordCount;
        wordCount = countWords(testString);
        System.out.println(wordCount);


    }

    public static HashMap<Character, Integer> countCharacters(String stringToCountCharacters) {
        HashMap<Character, Integer> countKeep = new HashMap<>();
        if (stringToCountCharacters == (null) || stringToCountCharacters.isEmpty()) {
            return new HashMap<Character, Integer>();
        }

        char[] stringToCharArray = stringToCountCharacters.toCharArray();
        for (char charElement : stringToCharArray) {
            countKeep.merge(charElement, 1, Integer::sum);
        }
        return countKeep;
    }

    public static HashMap<String, Integer> countWords(String stringToCountWords) {
        HashMap<String, Integer> countKeep = new HashMap<>();
        if (stringToCountWords == (null) || stringToCountWords.isEmpty()) {
            return new HashMap<String, Integer>();
        }

        String[] splitStringrArray = stringToCountWords.split(" ");
        for (String stringElement : splitStringrArray) {
            countKeep.merge(stringElement, 1, Integer::sum);
        }
        return countKeep;
    }
}
