package com.shapeAssignments;

public class Circle extends Shape{

    //Properties
//  ==================
    private final String name = "Circle";
    private final byte sides = 0;

    //Constructor
//  ======================
//    public Circle(){super();}

    public Circle(short sidesALength){
        super(sidesALength);
    }

    //Behavior
//  ======================


    public double calculateCircumference(short sideALength){
        return 2 * Math.PI * calculateRadius(sideALength);
    }

    public double calculateRadius(short sideALength){
        return sideALength / 2.0;
    }

    public double calculateArea(short sideALength){
        return Math.PI * calculateRadius(super.getSideALength());
    }

    @Override
    public String getName() {
        return name;
    }

    public byte getSides() {
        return sides;
    }

    //ToString
//  =================

    @Override
    public String toString() {
        return "Circle{" +
                "name= '" + getName() + '\'' +
                "\n sides= " + getSides() +
                "\n Diameter= " + super.getSideALength() +
                "\n Circumference= " + calculateCircumference(getSideALength()) +
                "\n Area= " + calculateArea(getSideALength()) +
                "\n Radius= " + calculateRadius(getSideALength())+
                '}';
    }
}
