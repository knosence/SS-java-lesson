package com.week2.day4.skillstorm;

public abstract class Person {

    // class variables
    private static boolean alive = true;

    // instance variable
    private String name;
    private byte age;

    // constructor
    // abstract classes still have constructors, even though we can't instantiate them
    // useful for initializing variables, etc.
    public Person() {
        super();
    }

    public Person(String name, byte age){
        this.name = name;
        this.age = age;
    }


    // methods
    // non-abstract methods ARE allowed
    public static void aliveCheck(){
        System.out.println(alive);
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name){
        this.name = name;
        return "Name was updated to " + name;
    }

       public byte getAge() {
        return age;
    }

    public String setAge(byte age) {
        this.age = age;
        return "Age was updated to " + age;
    }

    // abstract methods

    //CANNOT implement an abstract method here
    // MUST implement it in the subclass (or a subclass of the subclass, etc.)
    // no curly braces for these -- just a semicolon after the parentheses.
    public abstract String showDegree();
    public abstract void declareJob();
    public abstract void growUp();
}
