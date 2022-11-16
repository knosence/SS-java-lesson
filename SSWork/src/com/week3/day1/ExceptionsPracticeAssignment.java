package com.week3.day1;

public class ExceptionsPracticeAssignment {
    public static void main(String[] args) {

        RectangleAssignment rectangleOne = new RectangleAssignment((short) 12, (short) 0);

        try {
            throwRandomException(rectangleOne);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
        }

    }
    private static void throwRandomException(RectangleAssignment rectangle) {
        if (rectangle.getLength() == 0 || rectangle.getWidth() == 0) {
            throw new ArithmeticException() ;
        }
    }
}
