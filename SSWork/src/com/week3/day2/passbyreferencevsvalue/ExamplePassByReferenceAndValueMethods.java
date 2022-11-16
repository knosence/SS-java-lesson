package com.week3.day2.passbyreferencevsvalue;

import com.week3.day2.customExceptions.SuperHero;

public class ExamplePassByReferenceAndValueMethods {
    public static void main(String[] args) {
        int n = 10;
        increment(n);
        System.out.println(n);
    }

    public static void increment(int n) {
        n = n + 1;
    }

    public static void attackSuperHero(SuperHero superman) {
        superman.setIndestructible(false);
        System.out.println("This superhero is now " + superman.isIndestructible());
    }

}
