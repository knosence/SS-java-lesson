package com.week3.day3.arrays;

public class NestedLoops {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j + "\n");
                System.out.println("Hello " + (++count));
            }
        }
    }
}
