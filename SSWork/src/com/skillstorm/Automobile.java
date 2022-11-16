package com.skillstorm;

public class Automobile {

    public boolean isGasEngine;
    public String make;
    public short year;
    public String model;
    public byte doors;
    public int fuelRemainInTank = 100;
    public boolean isOn = false;

    public Automobile(boolean isGasEngine, String make, short year, String model, byte doors, boolean isOn) {
        super();
        this.isGasEngine = isGasEngine;
        this.make = make;
        this.year = year;
        this.model = model;
        this.doors = doors;
        this.isOn = isOn;
    }

    public String turnOn() {
        if (isOn == true) {
            return "Vehicle is already on!";
        } else if (fuelRemainInTank <= 0) {
            return "Need fuel";
        } else {
            isOn = true;
            fuelRemainInTank = fuelRemainInTank - 20;
            return "Vehicle is on, ready to move";
        }
    }

    public String refuel() {
        fuelRemainInTank = 100;
        return "Vehicle is on full";
    }

    public String turnOff() {
        if (isOn == true) {
            isOn = false;
            return "Turning off";
        } else {
            return "Already turned off";
        }
    }

    public String fuelRemainInTank() {
        return "Fuel in tank " + fuelRemainInTank;
    }

    public String fuelUpdate() {
        if (fuelRemainInTank > 0) {
            fuelRemainInTank = fuelRemainInTank - 20;
            return "Fuel is at " + fuelRemainInTank + ".";
        } else {
            return turnOff() + " because fuel is at 0";
        }
    }

    public String move() {
        if (isGasEngine == true && isOn == true) {
            fuelUpdate();
            return "Engine Noise and Tire noise";
        } else if (isGasEngine == false && isOn == true) {
            fuelUpdate();
            return "Coil Noise and Tire Noise";
        } else {
            return "Turn Vehicle on first";
        }


    }


}
