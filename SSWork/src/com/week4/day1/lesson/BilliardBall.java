package com.week4.day1.lesson;

public class BilliardBall {

    // instance variables like these live in the Heap (they persist as long as the BilliardBall Object does)
    private String color;
    private byte number;
    private boolean solid;

    public BilliardBall() {
        super();
    }
    // local variables like these parameters live in the Stack and are removed when the constructor finishes
    public BilliardBall(String color, byte number, boolean solid) {
        super();
        this.color = color;
        this.number = number;
        this.solid = solid;
    }

    public String getColor() {
        return color;
    }

    public byte getNumber() {
        return number;
    }

    public boolean isSolid() {
        return solid;
    }

    public BilliardBall setColor(String color){
       this.color = color;
       return this;
    }

    public BilliardBall setNumber(byte number) {
        this.number = number;
        return this;
    }

    public BilliardBall setSolid(boolean solid) {
        this.solid = solid;
        return this;
    }

    @Override
    public String toString() {
        return "BilliardBall{" +
                "color='" + color + '\'' +
                ", number=" + number +
                ", solid=" + solid +
                '}';
    }
}
