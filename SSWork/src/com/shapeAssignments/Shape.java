package com.shapeAssignments;

public abstract class Shape {

    private String name;
    private short sideALength;

    public Shape(){super();}

    public Shape(short sideALength){
        super();
        this.sideALength = sideALength;
    }

    public double calculateArea(short sideALength){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", sideALength=" + sideALength +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSideALength() {
        return sideALength;
    }

    public void setSideALength(short sideALength) {
        this.sideALength = (short)sideALength;
    }

}
