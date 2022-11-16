package com.Week6.day3.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIOAssignment {

    public static void main(String[] args) {

        String path = "/home/knosence/GitHub/SSWork/SSWork/src/com/Week6/day3/Assignment/";
        countNumberOfLines(path + "2554-0.txt");
        numberOfWords(path + "2554-0.txt");
        countCrimeAndPunishmentWords(path + "2554-0.txt");
    }

    public static void countNumberOfLines(String path) {
        int counter = 0;
        try (Scanner scan = new Scanner(new File(path))) {
            while (scan.hasNext()) {
                String row = scan.nextLine();
                counter = counter + 1;
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        System.out.println(counter);
    }

    public static void numberOfWords(String path) {
        int counter = 0;
        try (Scanner scan = new Scanner(new File(path))) {
            while (scan.hasNext()) {
                String row = scan.next();
                String[] splitLine = row.split(" ");
                for (String lineWord : splitLine) {
                    counter = counter + splitLine.length;
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        System.out.println(counter);
    }


    public static void countCrimeAndPunishmentWords(String path) {
        int crimeCount = 0;
        int punishmentCount = 0;
        try (Scanner scan = new Scanner(new File(path))) {
            while (scan.hasNext()) {
                String row = scan.nextLine();
                String[] splitLine = row.split("\\s+");
                for (String lineWord : splitLine) {
                    lineWord = lineWord.toLowerCase();
                    if (lineWord.trim().contains("crime")) {
                        crimeCount = crimeCount + 1;
                    }

                    if (lineWord.trim().contains("punishment")) {
                        punishmentCount = punishmentCount + 1;
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        System.out.println("Crime is " + crimeCount + " and punishment is " + punishmentCount);
    }
}
