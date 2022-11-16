package com.week3.day1;

public class Rec {
    // Make the class fully encapsulated
    private double length;
    private double width;

    public Rec() {
        this.length = 1; // default
        this.width = 1; // default
    }

    public Rec(double length, double width){
        isValid(length);
        isValid(width);
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        isValid(length);
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        isValid(width);
        this.width = width;
    }

    private static void isValid(double value){
        if (value <= 0) {
            throw new IllegalArgumentException("Please input a value > 0");
        }

    }

    public String toString() {
       return "Rectangle: width = " + width + ", height = " + length;
    }


}
