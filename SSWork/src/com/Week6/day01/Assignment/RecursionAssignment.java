package com.Week6.day01.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecursionAssignment {

    public static void main(String[] args) {
        int[] numberArrayFalseCase = {1, 50, 100, 4};
        int[] numberArrayTrueCase = {1, 50, 150, 4};
        System.out.println(sum(3));
        System.out.println(containsLargerThan100(numberArrayFalseCase));
        System.out.println(containsLargerThan100(numberArrayTrueCase));
        System.out.println(evenSum(0, 7));
        System.out.println(containsLargerThanN(numberArrayFalseCase, 500));
        System.out.println(containsLargerThanN(numberArrayTrueCase, 100));

    }

    // Problem 1: Accumulation (Recursively sum the numbers from 0 to n.)
    // public static int sum(int n) {
    //     return sumRecursively(int n - 1, int );
    // }

    public static int sum(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }


    // Problem 2: Search (Recursively determine if an int[] array contains values larger than 100.)
    public static boolean containsLargerThan100(int[] nums) {
        int bigOrZero = numbersBiggerThanN(nums, nums.length - 1, 100);
        if (bigOrZero > 100) {
            return true;
        } else {
            return false;
        }

    }

    public static int numbersBiggerThanN(int[] nums, int index, int end) {
        int biggerNumber;
        if (index == 0) {
            return 0;
        } else if (nums[index] > end) {
            return nums[index];
        } else {
            biggerNumber = numbersBiggerThanN(nums, index - 1, end);

        }
        return biggerNumber;
    }

    // Bonus 1 : Sum the even numbers between start (inclusive) and end (exclusive). (Throw an error if the user hands in a value end < start)
    public static int evenSum(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("Hey!! check your end and start!");
        }
        if (start == end) {
            return 0;
        } else if (start % 2 == 0) {
            return start + evenSum(start + 1, end);
        } else {
            return evenSum(start + 1, end);
        }
    }

    // Bonus 2 : Recursively determine if an int[] array contains values larger than n.
    public static boolean containsLargerThanN(int[] nums, int n) {
        int biggerThanN = numbersBiggerThanN(nums, nums.length - 1, n);
        if (biggerThanN > n) {
            return true;
        } else
            return false;
    }


}
