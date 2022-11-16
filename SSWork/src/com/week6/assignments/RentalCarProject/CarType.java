package com.week6.assignments.RentalCarProject;

public enum CarType {
    ECONOMY_CAR(35.00),
    LUXURY_CAR(60.00),
    SUV(50.00),
    MINIVAN(40.00),
    TRUCK(45.00);

    private final double value;

    CarType(double value) {
        this.value = value;
    }

    public double getCarTypeValue() {
        return value;
    }


}
