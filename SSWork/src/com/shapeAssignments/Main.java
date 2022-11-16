package com.shapeAssignments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);

        Circle circle = new Circle((short)10);
        System.out.println(circle.toString());
        circle.setSideALength((byte)15);
        System.out.println(circle.toString());

        Triangle triangle = new Triangle((short)10, (short)10, (short)12);
        System.out.println(triangle.toString());
        triangle.setSideALength((short)20);
        triangle.setSideBLength((short)15);
        triangle.setSideCLength((short)15);
        System.out.println(triangle.toString());
    }
}
