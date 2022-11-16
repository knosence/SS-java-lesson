package com.week4.Assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloMama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");

        String response = scan.nextLine();

        System.out.println("What would you like to say?");
        String otherResponse = scan.nextLine();

        System.out.println("You said your name is: " + response + " and you would like to say :" + otherResponse);

    }
}
