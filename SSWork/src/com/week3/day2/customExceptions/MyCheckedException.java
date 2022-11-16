package com.week3.day2.customExceptions;

public class MyCheckedException extends Exception{

    // no-args constructor that doesn't take in any values
    public MyCheckedException() {
        super();
    }

    // If I add this constructor, do I still have a default constructor?
    //  NO once I add this contractor Java does not keep the default constructor
    public MyCheckedException(String message) {
        // to set the message property I can call the super constructor
        super(message);
    }

    public MyCheckedException(String message, Throwable cause) {
        // to set the message and cause I can call super constructor
        super(message, cause);
    }

    public MyCheckedException(String message, Throwable cause, boolean suppressible, boolean writable) {
        super(message, cause, suppressible, writable);
    }

}
