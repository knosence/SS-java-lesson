package com.Week6.day3.lesson;

import java.io.*;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReaderPractice {

    /*

        What are we going to use to read from file?

        Option 1: BufferedReader

        Option 2: Scanner


        Goal 1: Read start time from classtime.txt

        Goal 2: print out all the groceries in groceries.txt

        Goal 3: Read in data, create objects

     */
    public static void main(String[] args) {

        String path = "/home/knosence/GitHub/SSWork/SSWork/src/com/Week6/day3/lesson/";
        readClassTimeFromFileUsingBR(path + "Classtime.txt");
        readAllFromFileUsingBR(path + "groceries.txt");
        readAllFromFileUsingScanner(path + "groceries.txt");
        System.out.println(parseCarData(path + "Cars.csv"));
    }

    // Option 1 - Goal 1:
    public static void readClassTimeFromFileUsingBR(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            reader.readLine(); // reads the first line but not stored
            String line = reader.readLine();
            System.out.println("Class starts at " + line);
        } catch (FileNotFoundException fnfe) { // file does not exist
            fnfe.printStackTrace();
        } catch (IOException ioe) { // if the file is corrupted etc.
            ioe.printStackTrace();
        }
    }

    // Option 1 - Goal 2:
    public static void readAllFromFileUsingBR(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    // Option 2
    public static void readAllFromFileUsingScanner(String path) {
        try (Scanner scan = new Scanner(new File(path))) {
            while (scan.hasNext()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    // Goal 3
    // create some objects -- create a Car class
    // read from the file -- create a Scanner
    public static LinkedList<Car> parseCarData(String path) {
        // make sure the file is a .csv
        if (!isCSV(path)) {
            throw new IllegalArgumentException("File not a csv");
        }
        // create list
        LinkedList<Car> cars = new LinkedList<>();
        //use a scanner
        try (Scanner scanner = new Scanner(new File(path))) {
            // throw away the first line (bc it's just the column names)
            if (scanner.hasNext())
                scanner.nextLine();
            // loop over the data
            while (scanner.hasNext()) {
                //read a line
                String row = scanner.nextLine();
                if (!row.isEmpty()) {
                    // parse the line
                    String[] cols = row.split(",");
                    if (cols.length >= 2) {
                        // create a car object
                        String name = cols[0];
                        // make sure this is a number
                        int year;
                        try {
                            year = Integer.parseInt(cols[1]);
                        } catch (NumberFormatException nfe) {
                            year = 0;
                        }
                        Car car = new Car(name, year);
                        // add to list
                        cars.add(car);
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        // return the list
        return cars;
    }

    // test if a patha is a .csv file
    private static boolean isCSV(String path) {
        // check the extenstion
        // use split on the "."
        String[] parts = path.split("\\.");
        return parts.length > 1 && parts[parts.length - 1].equals("csv");
    }

}
