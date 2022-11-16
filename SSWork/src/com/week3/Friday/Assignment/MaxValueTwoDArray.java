package com.week3.Friday.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxValueTwoDArray {
    public static void main(String[] args) {

        int[][] twoDArray = TwoDArrayGenerator(50, 4, 5);
        displayArray(twoDArray);
        System.out.println(findMax(twoDArray));
        System.out.println(findMin(twoDArray));

        ArrayList<String> names = new ArrayList<>();
        names.add("Nemo");
        
        System.out.println(names.indexOf("Nemo"));


    }

    public static int findMax(int[][] numbers) {
        int biggestNumber = -2147483648;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers[i].length - 1; j++) biggestNumber = Math.max(numbers[i][j], biggestNumber);

        }
        return biggestNumber;
    }

    public static int findMin(int[][] numbers) {
        int lowestNumber = 2147483647;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers[i].length - 1; j++) lowestNumber = Math.min(numbers[i][j], lowestNumber);
        }
        return lowestNumber;
    }

    // Abstracted looping into own method

    public static int[][] TwoDArrayGenerator(int upperBound, int numberOfRows, int numberOfCols) {
        int[][] arrayOfNumbers = new int[numberOfRows][numberOfCols];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++ ) {
                arrayOfNumbers[i][j] = (int) (Math.random() * upperBound);
            }
        }
        return arrayOfNumbers;
    }

    public static void displayArray(int[][] numbers) {
        System.out.println(Arrays.deepToString(numbers));
    }
}
