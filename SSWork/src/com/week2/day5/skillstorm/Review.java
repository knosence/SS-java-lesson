package com.week2.day5.skillstorm;

import java.sql.SQLOutput;

public class Review {
    public static void main(String[] args) {
        CoffeeMug myMug = new CoffeeMug((byte)16, "What if the Hokie-Pokie *is* what it's all about?", false);
        System.out.println(myMug);
        myMug.setMessage("Dad jokes 4 life");
        System.out.println(myMug);
        myMug.setMessage("Jokes?");
        System.out.println(myMug);
    }
}
