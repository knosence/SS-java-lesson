package com.shapeAssignments;

public class Triangle extends Shape{


    //Properties
//  ==================
    private final String name = "Triangle";
    private short sideBLength;
    private short sideCLength;
    private final short sides = 3;

    //Constructor
//  ======================
//    public Triangle(){
//        super();
//    }

    public Triangle(short sideALength, short sideBLength, short sideCLength){
        super(sideALength);
        this.sideBLength = sideBLength;
        this.sideCLength = sideCLength;
    }

    //Behavior
//  ======================
    public double calculateParameter(short sideALength, short sideBLength, short sideCLength){
        return sideALength + sideBLength + sideCLength;
    }

    public double calculateArea(short sideALength, short sideBLength, short sideCLength){
        return sideALength * sideBLength * sideCLength;
    }

    public short getSideBLength() {
        return sideBLength;
    }

    public void setSideBLength(short sideBLength) {
        this.sideBLength = sideBLength;
    }

    public short getSideCLength() {
        return sideCLength;
    }

    public void setSideCLength(short sideCLength) {
        this.sideCLength = sideCLength;
    }

    public short getSides() {
        return sides;
    }


    //ToString
//  =================

    @Override
    public String toString() {
        return "Triangle{" +
                "\n side A Length= " + getSideALength() +
                "\n side B Length= " + getSideBLength() +
                "\n side C Length= " + getSideCLength() +
                "\n sides= " + getSides() +
                "\n Parameter= " + calculateParameter(getSideALength(), getSideBLength(), getSideCLength())+
                "\n Area= " + calculateArea(getSideALength(), getSideBLength(), getSideCLength()) +
                '}';
    }
}
