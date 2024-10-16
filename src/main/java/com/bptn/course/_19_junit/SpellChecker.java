package com.bptn.course._19_junit;

import java.util.*;

class SpellChecker {
    private List<String> dictionary;

    // Constructor that initializes the dictionary with some words
    public SpellChecker() {
        dictionary = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "pear", "peach"));
        // Ensure the list is sorted for binary search
        Collections.sort(dictionary);
    }

    // Linear search for spell checking
    public boolean linearSpellCheck(String word) {
        for (String dictWord : dictionary) {
            if (dictWord.equals(word)) {
                return true;
            }
        }
        return false;
    }

    // Binary search for spell checking
    public boolean binarySpellCheck(String word) {
        int index = Collections.binarySearch(dictionary, word);
        if (index >= 0) {
            System.out.println("(Binary search) " + word + " is found in the dictionary.");
            return true;
        } else {
            System.out.println("(Binary search) " + word + " is not found in the dictionary.");
            return false;
        }
    }
}