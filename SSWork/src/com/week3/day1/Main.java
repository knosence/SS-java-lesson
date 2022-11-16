package com.week3.day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //    Rec rect = new Rec();
    //    Rec rect1 = new Rec(1,0);
    //    System.out.println(rect.toString());

        Scanner scan = new Scanner(System.in);
        Rec rect = new Rec(); //default 1 by 1
        boolean userInputIsValid = false;
        while (!userInputIsValid) {
            System.out.println("Please enter the rectangle's Length: ");
            double length = scan.nextInt();

            try {
                rect.setLength(length);
                userInputIsValid = true; // this will stop our loop - it will only run if the above line works
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        userInputIsValid = false;
        while (!userInputIsValid) {
            System.out.println("Please enter the rectangle's width: ");
            double width = scan.nextInt();

            try {
                rect.setWidth(width);
                userInputIsValid = true; // this will stop our loop - it will only run if the above line works
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


        scan.close();
    }
}
