package com.week3.day3.arrays;

import java.sql.SQLOutput;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1,2},{2,3},{3,4}}; // literals
        // jagged array
        int[][] numbers2 = {{1,2, 5, 10, -2},
                            {2,3, 32 ,4, -1, 36, 77, 100, 2000, 101, 20},
                            {3,4, 44, 32, 156, 134567, 34, 2}}; // literals

        //2D also have SET LENGTH
        int[][] example = new int[3][8];

        int[][] example2 = new int[3][]; // {{ }, { }, { }
        //int[][] example3 = new int[][3];

        String[][] people = { {"Joe", "Kenny", "Nita", "Naruto"},
                                {"Boots"},
                                {"Jon", "Erica", "Miles", "Waldo"}};

        String[] team1 = {"Aung", "Brandon", "Brittany"};
        String[] team2 = {"Ernest", "Brandom", "Aaliyah"};
        String[] team3 = {"Jon", "Erica", "Miles"};

        String[][] teams = {team1, team2, team3};

        // this is not practical
        Object[] objects = {team1, new TwoDArrays(), null}; // an array can hold different subtypes

        Object[][] different = {numbers, numbers2, teams, team1};

        System.out.print(numbers2[0][0] + " ");
        System.out.print(numbers2[0][1] + " ");
        System.out.print(numbers2[0][2] + " ");
        System.out.print(numbers2[0][3] + " " );
        System.out.println(numbers2[0][4] + " ");

        System.out.print(numbers2[1][0] + " ");
        System.out.println(numbers2[1][1] + " ");

        System.out.print(numbers2[2][0] + " ");
        System.out.println(numbers2[2][1] + " ");

        //less verbose way
        int[] innnerArray1 = numbers2[0]; //grabs the WHOLE inner array
        int[] innnerArray2 = numbers2[1]; //grabs the WHOLE inner array
        int[] innnerArray3 = numbers2[2]; //grabs the WHOLE inner array

//        System.out.println(innnerArray1); // THIS DOES NOT WORK
//        System.out.println(innnerArray2);
//        System.out.println(innnerArray3);
        for (int i = 0; i < innnerArray1. length; i++) {
            System.out.print(innnerArray1[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < innnerArray2.length; i++) {
            System.out.println(innnerArray2[i] + " ");
        }
        System.out.println();

         for (int i = 0; i < innnerArray2.length; i++) {
            System.out.println(innnerArray2[i] + " ");
        }
        System.out.println("\nLast Print \n");
         // Least verbose version
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Number[i].length " + numbers2[i].length);
            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.println(numbers2[i][j]);
            }
            System.out.println();
        }


        System.out.println(sum(numbers2));
        System.out.println("\n" + count(numbers2));

        System.out.println("\n" + average(numbers));

        System.out.println("Where is Waldo?");
        int[] result = whereIsWaldo(people);
        try {
            System.out.println("row =" + result[0]);
            System.out.println("col =" + result[1]);
        } catch (NullPointerException e) {
            System.out.println("Did not find Waldo");
        }
    }

    private static void prettyPrint(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sum(int[][] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                result += numbers[i][j];
                System.out.println(numbers[i][j]);
            }
        }
        return result;
    }

    private static int count(int[][] numbers){
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                result += 1;
            }
        }
        return result;
    }

    private static double average(int[][] numbers) {
        double result = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
                count++;
            }
        }

        result = (double) sum / count;

        return result;
    }

    // this will return the row and column like {0,0} so [row, col]
    // returns the location of the FIRST Waldo
    public static int[] whereIsWaldo(String[][] people) {
        int row = 0;
        int col = 0;

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[i].length; j++) {
                if ("Waldo".equals(people[i][j])){
                    row = i;
                    col = j;
                    return new int[]{row, col};
                }

            }
        }

        return new int[]{0, 0};
    }


}
