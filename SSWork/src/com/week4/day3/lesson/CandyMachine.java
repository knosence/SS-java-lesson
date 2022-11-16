package com.week4.day3.lesson;

// this is our "owner" class that will HAVE-A class as a property
public class CandyMachine {

    //standard Props
    private String name;
    private String manufacturer;
    private boolean powered;

    // this prop is the object that our class HAS
    // so now, our CandyMachine Has-A MixingApparatus
    private MixingApparatus mixingApparatus = new MixingApparatus();

    //constructors
    public CandyMachine() {
        super();
    }

    public CandyMachine(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    // getters and setters; dont need one for the MizingApparatus, because we wanna keep it the same
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    // custom method
    // changes power state no matter which is it
    public boolean togglePower() {
        powered = !powered;
        return powered;
    }

    // the funnctionality for this method is offloaded to the MixingApparatus
    public Candy makeCandy(int cupsOfSugar) {
        Candy newCandy =  mixingApparatus.mixCandy(cupsOfSugar);

        return newCandy;
    }






}
