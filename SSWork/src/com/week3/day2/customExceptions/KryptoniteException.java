package com.week3.day2.customExceptions;


// Custom exception
// Is an unchecked exception
public class KryptoniteException extends RuntimeException{

    //Constructors
    public KryptoniteException() {
        super();
    }

    public KryptoniteException(String message) {
        super(message);
    }
}
