package com.week4.day5.lesson;

import java.security.spec.RSAOtherPrimeInfo;

public class InstanceOf {
    public static void main(String[] args) {
        // INSTANCEOF vs. GETCLASS

        Person person = new Person();

        // instanceof -- returns a boolean
        System.out.println(person instanceof Person);

        // getClass() -- returns a class type
        System.out.println(person.getClass());

        System.out.println();
        SleepyPerson sleepyPerson = new SleepyPerson();

        System.out.println(sleepyPerson.getClass());
        System.out.println(sleepyPerson instanceof SleepyPerson);
        System.out.println(sleepyPerson instanceof Person);


    }
}
