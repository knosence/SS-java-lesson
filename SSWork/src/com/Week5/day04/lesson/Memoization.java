package com.Week5.day04.lesson;

public class Memoization {

    /*
     * what is memoization?
     * -- memorizing (aka caching) the values to avoid re-calculating them over and over
     */
    public static Long[] fibs = new Long[100];

    static { // this is OK bc it runs when the class loads
        fibs[0] = 0L;
        fibs[1] = 1L;
    }


    public static long fibonacciMemoized(int n) {
        if (n < 2) {
            return n;
        }
        long fibNm1;
        long fibNm2;
        if (fibs[n - 1] == null) {
            fibNm1 = fibonacciMemoized(n - 1);
        } else {
            fibNm1 = fibs[n - 1];
        }

        if (fibs[n - 2] == null) {
            fibNm2 = fibonacciMemoized(n - 2);
        } else {
            fibNm2 = fibs[n - 2];
        }

        fibs[n] = fibNm1 + fibNm2;
        return fibs[n];
    }


    // Recursive Fibonacci code from yesterday
    public static long fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        //System.out.println(fibonacci(40));
        long startTime = System.nanoTime();
        long result = fibonacci(2);
        long endTime = System.nanoTime();
        double seconds = ((double) (endTime - startTime)) / 1_000_000_000;
        System.out.println("Result was " + result);
        System.out.println("Time taken was " + (endTime - startTime) + " nano seconds");
        System.out.println("Time taken was " + seconds + " nano seconds");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Using Memoization: ");

        startTime = System.nanoTime();
        result = fibonacciMemoized(50);
        endTime = System.nanoTime();
        seconds = ((double) (endTime - startTime)) / 1_000_000_000;
        System.out.println("Result was " + result);
        System.out.println("Time taken was " + (endTime - startTime) + " nano seconds");
        System.out.println("Time taken was " + seconds + " nano seconds");
    }

}
