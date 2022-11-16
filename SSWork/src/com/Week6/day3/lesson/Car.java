package com.Week6.day3.lesson;

public class Car {
    private String name;
    private int year;

    public Car() {
        super();
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCommaSeperatedValues() {
        return name + "," + year;
    }

    @Override
    public String toString() {
        return "Car{" +
                +year +
                name + "\'" +
                "}\n";
    }
}
