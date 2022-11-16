package com.week3.Friday.Lesson;

public class CalculatingBigO {
    public static void main(String[] args) {
        //Example 1:
        System.out.println("Hello"); // O(1)
        System.out.println(1+3); // 3 or 2 -- O(1)

        //Example 2:
        for (int i = 0; i < 10; i++) { // 0, 1, 2, 3, ... 9 = 10 times
            System.out.println("meow"); // O(n)
        }

        int n = 100;
        for (int i = 0; i < n; i += 2) { // the loop executes n/2 --- O(n)
            System.out.println(i); // one instruction is run in the loop
        }

        n = 100;
        for (int i = 0; i < n; i *= 2) { // the loop executes n*2 --> the loop runs 2 * 2 * 2 *.... = 1024 --> 2^? =
            System.out.println(i); // one instruction is run in the loop
        }
    }
}
