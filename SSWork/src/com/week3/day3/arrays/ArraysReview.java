package com.week3.day3.arrays;

public class ArraysReview {
    public static void main(String[] args) {
        int[] myNumbers;
        myNumbers = new int[3]; // new
        myNumbers[0] = 1;
        myNumbers[1] = 2;
        myNumbers[2] = 3;

        //for-loop
        for (int i = 0; i < myNumbers.length; i++){
            myNumbers[i] *= 2;
        }
        System.out.println(myNumbers);

        // for-each
        for (int number : myNumbers) {
            System.out.println(number *=2);
        }

        int counter = 0;
        while (counter < 5) {
            counter++;

        }

    }

    private static void print(int[] myNumbers) {
        for (int number : myNumbers) {
            System.out.println(number);
        }
    }
}
