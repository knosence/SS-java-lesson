package com.week3.day2.customExceptions;

public class SuperHero {
    private boolean indestructible;



    public void fly(String weather) throws BadWeatherException {
        if (weather.equals("Rainy")) { //throw new Exception(); // I want to be more specific than this and throw my own exception type
            throw new BadWeatherException("Cant fly when its raining");
        }
        System.out.println("Whoosh! Flying to the rescue");
    }

    public void fightCrime() {
        if (!indestructible){
            // throw an exception that Justice wasn't served
            throw new KryptoniteException("Foiled by Kryptonite. Justice was not served today.");
        }
        System.out.println("Justice is served");
    }

    public boolean isIndestructible() {
        return this.indestructible;
    }

    public void setIndestructible(boolean indestructible) {
        this.indestructible = indestructible;
    }
}
