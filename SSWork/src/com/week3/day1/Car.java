package com.week3.day1;

public final class Car {
    /*
    Three places we can use final
    1. on a variable -- this means you can set the value once, and you can't reset it
        to clarify, an instance variable class
    2. on a class -- this means we can't create and subclasses (this class cannot be extended)
    3. on a method -- this means the method cannot be overriden in a class
    4. cannot use final on a local variable inside of a method
     */

//    private final String color;

    //encapsulation = Properties
    //polymorphism = behavior
        //override = method body
        //overloading = parameters
    public void drive() {
        if (runEngine()) System.out.println("Driving vroom vroom");
        else System.out.println("Something went wrong");
    }

    /*
    6pm to 10pm
    1000 Parkwood Circle SE, Atlanta,ga 30339
     */

    private boolean runEngine() {
        return true; // the engin working fine
    }
}
