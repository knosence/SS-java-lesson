package com.week4.day1.lesson;

import java.util.LinkedList;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        /*
         * Bubble sort
         *
         * The buble sort compaires each pair of items in an list and swaps them if they're out of order
         *
         * Iterates through each pair, then does multiple passes through the list until there are no more swaps
         *
         * useful tool for sorting an already-in-place list
         */

        LinkedList<Integer> myInts = new LinkedList<Integer>();

        myInts.add(8);
        myInts.add(3);
        myInts.add(9);
        myInts.add(5);
        myInts.add(10);
        myInts.add(1);
        myInts.add(2);
        myInts.add(7);
        myInts.add(4);
        myInts.add(0);
        myInts.add(6);

        System.out.println("myInts initial state:");
        System.out.println(myInts);

        System.out.println("myInts first pass");
        bubblesSortOnePass(myInts);
        System.out.println(myInts);

        System.out.println("myInts full pass");
        bubbleSort(myInts);

        LinkedList<Integer> myEmptyList = new LinkedList<Integer>();
        bubbleSort(myEmptyList);

        LinkedList<Integer> myGiantList = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            myGiantList.add(new Random().nextInt(1000));
        }

        System.out.println();
        System.out.println("myGiantList of 100 random numbers 0-999:");
        System.out.println(myGiantList);

        System.out.println();

        bubbleSort(myGiantList);
        System.out.println("myGiantList after being bubble-sorted:");
        System.out.println(myGiantList);

    }

    public static void bubbleSort(LinkedList<Integer> intList) {

        // checking to see if the user gave us a null list object
        if (intList != null) {

            // this loop refers to each pass through the list; we need one fewer than the list's size to fully sort
            for (int j = 0; j < intList.size() - 1; j++) {

                // this loop refers to the swaps within each pass; we need one for each pass, so one fewer than the list's size
                for (int i = 0; i < intList.size() - 1; i++) {

                    //if the one we're on is greater than the next one...
                    if (intList.get(i) > intList.get(i + 1)) {
                        //... remove it and insert it after the next one
                        intList.add(i + 1, intList.remove(i));
                    }
                }
            }
        }
    }
    public static void bubblesSortOnePass(LinkedList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            if (intList.get(i) > intList.get(i + 1)) {
                intList.add(i + 1, intList.remove(i));
            }
        }
    }
}
