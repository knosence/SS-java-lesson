package com.Week5.day03.lesson;


import java.util.LinkedList;
import java.util.Random;

public class RecursionPractice {

    /*
     * What is recursion
     * - when a method calls itself
     *
     * Danger
     * - you can get yourself into a never ending loop
     * - file system searches are a good example
     * - tree traversal is a good example
     * - divide and conquer to solve the problem
     *
     */

    public static void main(String[] args) {
        //doStuff();

        //System.out.println(factorial(3));

        // example 2 - reverse  string
        System.out.println(reverse("Hello"));

        recursiveReverseV2("Hello", 0);

        // Example 3 - sum an array
        int[] nums = { 1, 3, 8, 20, 2, 7 };
        System.out.println(sumArrayRecursive(nums, 0));

        Cat cat = new Cat("Boots", 1);
        Cat cat2 = new Cat("Nacho", 25);
        Cat cat3 = new Cat("Incineroar", 10);
        Cat cat4 = new Cat("Barney", new Random().nextInt(100));

        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        Cat best = findCutestCat(cats, 0);
        System.out.println(best.name + " " + best.cuteness);

        int n = 50;

         for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    } // end of main

    public static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    public static void doStuff(){
        System.out.println("doing stuff");
        doStuff();
    }


    public static int iterativeFactorial(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * i;
        }
        return answer;
    }

    public static int factorial(int n) {
        System.out.println("n = " + n);
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    // a method to reverse a string
    public static String reverse(String word){
        // edge case
        if (word == null) {
            return "llun";
        }

        // reverse the string
        // base case
        if (word.isEmpty()) {
            return word;
        } else {
            // step 1: find the index of the last character
            int lastIndex = word.length() - 1;
            // step 2: get the substring excluding the last character
            String substring = word.substring(0, lastIndex);
            // step 3: concatenate last character to result of reversing the rest
            String result = word.charAt(word.length() - 1) + reverse(substring);
        }
        return word;
    }

    // reverse more like a while loop -- recursive version
    public static String recursiveReverseV2(String word, int index) {
        if (index < 0) {
            return "";
        }
        else {
            return word.charAt(index) + recursiveReverseV2(word, index - 1);
        }
    }


    //example 3 ---> sum an array!!
    public static int sumArrayRecursive(int[] nums, int index) {
        System.out.println("index = " + index);
        //base case!
        if (index > nums.length - 1) {
            System.out.println(0);
            return 0;
        } else {
            // definition
            System.out.println("I'm adding myself" + nums[index]);
            int result = nums[index] + sumArrayRecursive(nums, index + 1);
            System.out.println(result);
            return result;
        }
    }

    public static Cat findCutestCat(LinkedList<Cat> cats, int index) {
        //base case
        if (cats == null) {
            return null;
        }
        if (index >= cats.size() - 1) {
            return cats.get(index);
        } else if (index == cats.size() - 2){ // second base case needed!{
            Cat cat1 = cats.get(index);
            Cat cat2 = cats.get(index + 1);
            if (cat1.compareTo(cat2) < 0) {
                return cat2;
            } else {
                return cat1;
            }
        } else {
            Cat cat1 = cats.get(index);
            Cat cat2 = findCutestCat(cats, index + 1);
            if (cat1.compareTo(cat2) < 0) {
                return cat2;
            }else {
                return cat1;
            }
        }

    }

    // f(n) = f(n-1) + f(n-2) for n



}
