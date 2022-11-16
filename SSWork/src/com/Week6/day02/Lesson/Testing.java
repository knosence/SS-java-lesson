package com.Week6.day02.Lesson;

public class Testing {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    continue outer;
                }
                System.out.println("i=" + i + " , j=" + j);
            }
        }

        int i = 5;
        float f = 5.5f;
        if (i == f) System.out.println("It works");
        ;

        char name = '\uDEAF';
    }
}
