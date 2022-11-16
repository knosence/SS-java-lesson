package com.week3.day2.customExceptions;

public class TestSuperhero {
    public static void main(String[] args) throws BadWeatherException {
        SuperHero superman = new SuperHero();
        superman.setIndestructible(true);
        superman.fly("Beautiful Day to Fly");
  //      superman.fly("Rainy");

        superman.fightCrime();
        superman.setIndestructible(false);
        superman.fightCrime();
    }
}
