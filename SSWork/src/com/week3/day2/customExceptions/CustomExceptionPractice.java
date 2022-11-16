package com.week3.day2.customExceptions;

public class CustomExceptionPractice {
    public static void main(String[] args) throws MyCheckedException {

        try {
            doStuff();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of Main");
        // you do not inherit constructors
        MyCheckedException e = new MyCheckedException("Something");
        //what does the enableSuppression and writableToStack defualt to?
        //  -- it probably defaults to true == so we can write it to stack
    }

    public static void doStuff() throws MyCheckedException {
        // to throw custom exception
        // we need to create a class
        // - the convention to name the class with "exception" at the end of the name
        throw new MyCheckedException("Something unexpected happened! Whoopsie daisies");
    }
}
