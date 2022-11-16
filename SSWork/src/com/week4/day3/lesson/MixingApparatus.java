package com.week4.day3.lesson;

// this is the class that our "owner" class HAS one of
public class MixingApparatus {

    public Candy mixCandy(int cupsOfSugar) {
        // must cast cupsOfSugar to a double, or we get the wrong calculation sometimes
        // COULD solve this by changing int into double in para and in para in CandyMachine
        double weight = (double)cupsOfSugar / 2;

        return new Candy(weight);
    }

}

