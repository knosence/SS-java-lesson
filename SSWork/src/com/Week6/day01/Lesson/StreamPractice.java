package com.Week6.day01.Lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    /*

        What is a stream?
        - Definition: a sequence of elements that supports aggregate operations and processing them as a whole
        - Usage: Processing a sequence of data
        ---

        What is the difference between a stream and a list or other collections?
        - stream you can only access once
        - list you can access until you destroy it

        - stream is for operating on the whole sequence
        - list is for operating on individual elements
        ---

        What use streams?
        - less for loops!
        - "Streamlines" our code
        ---

        Utility methods streams provide:
        **** Note: all of them will not mutate your original data set *****
        1. forEach - took each element, does something with it, does not return anything
        2. map - take each element, does something to it, return the new elements in a stream.
        3. filter - returns a new stream -- only contains elements that pass the "filter"
        4. reduce - returns a single value  eg: sum, max, min etc.

     */


    public static void main(String[] args) {
        /*
            Ways to create a stream:
            1. from a list
            2. from an array
            3. from primitives! (int, long, double)


         */
        // Method 1: lists
        List<String> favoriteFoods = Arrays.asList("pineapple", "steak", "pizza");
        Stream<String> foodsStream = favoriteFoods.stream();
        foodsStream.forEach((food) -> System.out.println(food.toUpperCase() + " is the best!"));

        // foodsStream.forEach((f) -> System.out.println(f));
        System.out.println(favoriteFoods);

        // --- map
        Stream<String> foodsStream2 = favoriteFoods.stream();
        Stream<String> newStream = foodsStream2.map((f) -> f.substring(2));
        System.out.println(newStream);
        //newStream.forEach(System.out::println);

        // convert our stream back to a list
        // use the Collectors utility class
        List<String> newList = newStream.collect(Collectors.toList()); // collects the stream into a list using a Collectors utility
        System.out.println(newList);



    }
}
