package com.Week5.day05.lesson;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class UsefulUsesOfLambdas {

    public static void main(String[] args) {
        LinkedList<State> state3 = new LinkedList<State>(Arrays.asList(
                new State("Georgia", 10_00_00, 59_425),
                new State("Alabama", 5_040_000, 52_419),
                new State("Florida", 21_780_000, 65_758),
                new State("Colorado", 5_812_000, 104_185)));

        // Step 1: convert to stream
        Stream<State> stateStream = state3.stream();
        // Step 2: use java built-in .forEach(method) using our lambda
        // get the first two letters
        // capitalize them
        // print them out
        stateStream.forEach((state) -> {
            String name = state.getName();
            String abbreviation = name.substring(0,2);
            abbreviation = abbreviation.toUpperCase();
            System.out.println(abbreviation);
        });

        // Example 2
        // for each will not mutate our list so save the reuslt
        Stream<State> stateStream2 = state3.stream();
        Stream<State> stateStreamAltered = stateStream2.map((state) -> {
            String alteredName = state.getName().substring(0,2).toUpperCase();
            int population = state.getPopultation();
            int alteredSize = state.getSize();
            State alteredState = new State(alteredName, population,alteredSize);
            return alteredState;
        });

        System.out.println(stateStreamAltered);
    }
}
