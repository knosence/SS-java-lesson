package com.Week5.day04.lesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecursiveReview {

    public static int findLongestLength(LinkedList<String> words) {
        // base case
        if (words.isEmpty()) {
            return 0;
        } else {// recursive call

            int current = words.remove().length();
            int winner = findLongestLength(words);
            return Math.max(current, winner);
        }
    }

    public static String findLongest(LinkedList<String> words) {
        if (words.isEmpty()) {
            return "";
        } else {
            String current = words.remove();
            String winner = findLongest(words);

            if (current.length() > winner.length()) {
                return current;
            } else {
                return winner;
            }
        }
    }

    public static String findLongest(ArrayList<String> words) {
        return helpFindLongest(words, 0);
    }

    private static String helpFindLongest(ArrayList<String> words, int index) {
        if (index > words.size() -1) {
            return "";
        } else {
            String current = words.get(index);
            String winner = helpFindLongest(words, index + 1);

            if (current.length() >= winner.length()) {
                return current;
            } else {
                return winner;
            }
        }
    }

    public static boolean contains(List<String> words, String searchTerm) {
        return helpSearch(words, searchTerm, 0);
    }

    public static boolean helpSearch(List<String> words, String searchTerm, int index){

        if (index > words.size() - 1){
            return false;
        } else if (searchTerm.equals(words.get(index))) {
            return true;
        } else {
            return helpSearch(words, searchTerm, index + 1);
        }
    }

}
