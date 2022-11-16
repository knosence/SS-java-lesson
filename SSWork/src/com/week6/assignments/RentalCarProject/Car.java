package com.week6.assignments.RentalCarProject;

import java.util.Arrays;
import java.util.Objects;

public class Car {

    private String name;
    private int year;
    private CarType type;
    private double rentalPrice;

    public Car() {
    }

    public Car(String name, int year, CarType type) {
        setName(name);
        setYear(year);
        setType(type);
        setRentalPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("The name you have entered is incorrect. Please choose a name that is not null");
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2010 || year > 2023)
            throw new IllegalArgumentException("The year you have entered is incorrect. Please choose a year between 2010 and 2023");
        this.year = year;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        if (type == null || !isCarType(type))
            throw new IllegalArgumentException("The type car you have entered is not available. Please select ECONOMY_CAR, LUXURY_CAR, SUV, MINIVAN, or TRUCK");

        this.type = type;
        System.out.println("Type was set to " + this.type);
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice() {
        this.rentalPrice = type.getCarTypeValue();
    }

    private boolean isCarType(CarType type) {
        CarType[] carTypes = CarType.values();
        return Arrays.asList(carTypes).contains(type);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() && Double.compare(car.getRentalPrice(), getRentalPrice()) == 0 && Objects.equals(getName(), car.getName()) && getType() == car.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getType(), getRentalPrice());
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name of the Car= '" + name + '\'' +
                ", Year= " + year +
                ", Car Type= " + type +
                ", Rental Price= " + rentalPrice +
                '}';
    }
}
