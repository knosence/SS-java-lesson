package com.week2.day4.skillstorm;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        // SWITCH STATEMENT

        /*
        A switch statement is a logic gate with more than two possible outcomes
        -- if/else statements only have two -- if true, do this; otherwise do that
        -- even if you have multiple if/else, else if, nested statements, etc., each one still only goes one of two ways

        A switch statement takes a non-boolean condition
        -- you CANNOT use a boolean as the switch condition
        -- can have as many different outcomes
         */

        //variable we're going to use in our switch statement
        // cannot be a boolean!
        String stringToSwitchON = "Hello!";

        switch (stringToSwitchON) {
            case "Hello!":
                System.out.println("Hello right back atcha!");
                break;
            case "Good morning!":
                System.out.println("And a good morning it is, sir.");
                break;
            case "Good afternoon!":
                System.out.println("Indeed... time for a nap.");
                break;
            case "Good Evening!":
                System.out.println("Welcome to cocktail hour!");
                break;
            case "Goodnight!":
                System.out.println("Zzzzz...");
                break;
            default:
                System.out.println("Nice greeting, nice greeting.");
                break;
        }


        // Sometimes, you may WANT your switch statement to cascade, i.e., to NOT break after each bit of code
        String personAtTheFront = "Rob";
        System.out.println();
        System.out.println("Who's in front? And who's left after that in Line?");

        //without break statement, we cascade all the way through to bottom
        // and, in this case, we WANT to!
        switch (personAtTheFront) {
            case "Rob":
                System.out.println("Rob");
            case "Miles":
                System.out.println("Miles");
            case "Rogetta":
                System.out.println("Rogetta");
            case "Zulmak":
                System.out.println("Zulmak");
            case "Victoria":
                System.out.println("Victoria");
            case "Christopher":
                System.out.println("Christopher");
            case "Kelvin":
                System.out.println("Kelvin");
            case "Brittany":
                System.out.println("Brittany");
            case "RIngo":
                System.out.println("Lamar");
            case "Jon":
                System.out.println("Jon");
            case "Erica":
                System.out.println("Erica");
            case "Rina":
                System.out.println("Rina");
        }

        // can have multiple cases leading to the same code
        // by leaving them blank

        System.out.println();
        String dayOfTheWeek = "";

        //we won't always have a fixed value for a variable
        // imagine pulling items from a database that may be of different types

        //Generating a random integer from 0 to 6
        int random = new Random().nextInt(7);

        // using a switch statement to give a value to dayOfTheWeek base on our random number
        // CAN switch on a numerical value (still not a boolean)
        switch (random) {
            case 0:
                dayOfTheWeek = "Sunday";
                break;
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
            default:
                break;
        }
        //printing out the day of the week we assigned
                System.out.println(dayOfTheWeek);

        // switching on our assigned
        switch (dayOfTheWeek) {
            case "Sunday":
            case "Saturday":
                System.out.println("It's the weekend!");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("Boo...Weekday");
                break;
            case "Friday":
                System.out.println("Weekend incoming!");
                break;
                // default CAN be in the middle or at the beginning, but since it's our "else," in effect, it should be at the end
            default:
                System.out.println("Um... nice day. bruh.");
                break;
        }


    }


}
