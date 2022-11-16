package com.week3.day2.customExceptions;

public class BadWeatherException extends Exception{
    public BadWeatherException() {
        super();
    }

    public BadWeatherException(String message) {
        super(message);
    }
}
