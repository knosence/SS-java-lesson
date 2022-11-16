package com.skillstorm;

public class Truck extends Automobile{

    public boolean canTow = true;

    public Truck(boolean isGasEngine, String make, short year, String model, byte doors, boolean isOn, boolean canTow) {
        super(isGasEngine, make, year, model, doors, isOn);
        this.canTow = canTow;
    }

    public String towAway(String whatToTow) {
        if (canTow) {
            fuelUpdate();
            fuelUpdate();
            return "Towing away " + whatToTow;
        } else {
            return "Not able to tow " + whatToTow;
        }
    }



}
