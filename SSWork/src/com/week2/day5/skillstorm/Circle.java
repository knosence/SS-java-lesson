package com.week2.day5.skillstorm;

//
public class Circle implements Shape{

    // this Circle Must include this method, because the interface says it has to

    @Override
    public void declareMyself() {
        System.out.println("I am a Circle, and I have no sides");
    }
}
