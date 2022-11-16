package com.week2.day4.skillstorm;

public class Abstraction {
    public static void main(String[] args) {
        // ABSTRACTION
        /*
        Abstraction is hiding the details of our code's implementation from the "user
        -- "user" can mean actual person using our code
        -- "user" can ALSO mean different class or another piece of code

        Two main ways we do this in Java:

        Abstract Classes
        Interfaces

        One of objective here is "loose coupling"
        -- reducing the dependence on individual Objects and between individual Objects
        -- increasing modularity and resuablilty
        -------------------------------------------
        Abstract Class
        -- also known as a "partially-implemented" class

        we have been creating fully-implemented classes so far

        An abstract class can have static and/or instance properties
        -- can also have static and/or instance methods
        -- can ALSO-ALSO have abstract methods
        -- an abstract class CANNOT be instantiated

        REQUIRES inheritance:
        Useful in instances where you'll never want to work directly with the parent class, only the subclass(es)
        -- all subclasses MUST implement the things that aren't implemented in the abstract superclass
        ------------------------------------------------
        Interface

        An interface is pure abstraction
        -- can ONLY contain abstract methods
        -- can NOT contain any regular methods or constructors
        -- the only type of property you can include in an interface is a static final property (must be initialized)

        You CAN implement multiple interfaces
        -- one class cannot extend more than one class, but it CAN implement more than one interface

         */

        Person.aliveCheck();

        // can do this because Nurse is not abstract
        Nurse nurse = new Nurse("same", (byte) 54);

        // can do this because we're only using Person as a reference type
   //    Person otherNurse = new Nurse();

        //can not do this because we cannot instantiate a Person
        // Nurse thirdNurse = new Person();

        nurse.declareJob();
        System.out.println(nurse.getAge());
        nurse.growUp();
        System.out.println(nurse.getAge());

        Person nurseWithProperties = new Nurse("Sarah", (byte)32, "R.N.");
        Person teacherOne = new Teacher("Rob", (byte)45, "B.A.");

        //Teacher teacherOne = new Teacher("Rob", (byte)45);

        System.out.println(teacherOne.getAge());
        System.out.println(teacherOne.getName());
        System.out.println(teacherOne.showDegree());

        //can do this because Nurses and Teachers ARE Persons and Professionals
        Person[] personArray = {nurseWithProperties, teacherOne};
        Professional[] professionalArray = {(Professional) nurseWithProperties, (Professional) teacherOne};
    }
}
