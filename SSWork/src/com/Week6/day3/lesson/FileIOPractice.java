package com.Week6.day3.lesson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.stream.Stream;

public class FileIOPractice {

    /*
        What is IO?
        - Input/Output aka reading/writing to a file or anything else

        How can we read/write to/from a file?
        - writing to a file:
        -- BufferedWriter
        --- good for large files (buffering = fills buffer, fills buffer, flush buffer
        --- loading/writing all at once would take up too much time and too much memory
        --- "wraps" other writers (adding buffering functionality
        -- other options, PrintWriter, Files, FileWriter, etc
     */

    public static void main(String[] args) {
        writeToFileOldWay();

        // TRY_WITH_RESOURCES -- Java handles closing the resource for me
        //                    -- use anytime creating an instance of an
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./stuff.txt"))) {

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        String path = "/home/knosence/GitHub/SSWork/SSWork/src/com/Week6/day3/lesson/";

        // call method with same file
        LinkedList<String> lines = new LinkedList<>();
        lines.add("Never");
        lines.add("gonna");
        lines.add("give");
        lines.add("you");

        writeMultipleLinesToFile("/home/knosence/GitHub/SSWork/SSWork/src/com/Week6/day3/lesson/test.txt", lines);
        writerStringToFile("/home/knosence/GitHub/SSWork/SSWork/src/com/Week6/day3/lesson/test.txt", "up");

        saveCar(path + "Cars.csv", new Car("Maserati", 2015));

        LinkedList<Car> cars = FileReaderPractice.parseCarData(path + "Cars.csv");
        saveCars(path + "Cars.csv", cars);


    }

    public static void writeMultipleLinesToFile(String path, LinkedList<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                writer.write(line);
                writer.write("\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void writerStringToFile(String path, String word) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(word);
            writer.write("\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void writeToFileOldWay() {
        BufferedWriter writer = null;
        try {
            // default mode is WRITE -- writes over all the contents
            // to put an APPEND mode -- use a second parameter and set it to true
            writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.write("Hello World"); // WHERE? the current folder our program is running in

            // IMPORTANT!!
            writer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }


    // Goal: Write a car to our csv file
    public static void saveCar(String path, Car car) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            String carString = car.getCommaSeperatedValues();
            writer.write("\n" + carString);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    // Goal: Write all the car to our List of cars to a .csv file
    public static void saveCars(String path, LinkedList<Car> cars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            Stream<Car> carStream = cars.stream();
            carStream.forEach(car -> {
                String carString = car.getCommaSeperatedValues();
                try {
                    writer.write("\n" + carString);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            });
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
