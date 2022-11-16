package com.week3.Friday.Assignment;

import java.util.ArrayList;

public class main {


    public static void main(String[] args) {

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Rust");
        programmingLanguages.add("Python");

        ArrayList<String> dev2ProgrammingLanguages = new ArrayList<>();
        dev2ProgrammingLanguages.add("JavaScript");
        dev2ProgrammingLanguages.add("Haskell");
        dev2ProgrammingLanguages.add("Fortran");

        Programmer dev = new Programmer(programmingLanguages, "Richard Stallman", "Home Depot");
        Programmer dev2 = new Programmer(dev2ProgrammingLanguages, "linus Torvalds", "Philips");

        // Learning and forgetting a language test case
        //--> (Lisp -> learnProLang() => [Java, Rust, Python, Lisp])
        System.out.println("\nLearning language test case");
        System.out.println(dev);
        dev.learnProLang("Lisp");
        System.out.println(dev);

        System.out.println();
        System.out.println(dev2);
        dev2.learnProLang("C Lang");
        System.out.println(dev2);

        System.out.println("\nForgetting language test case");
        //-->(Lisp -> forgetProLang() => [Java, Rust, Python])
        dev.forgetProLang("Lisp");
        System.out.println(dev);

        System.out.println();
        dev2.forgetProLang("Fortran");
        System.out.println(dev2);

        System.out.println("\nLeaning w/ null language test case");
        //-->(null -> learnProLang() => [Java, Rust, Python])
        dev.learnProLang(null);
        System.out.println(dev);

        System.out.println();
        dev2.learnProLang(null);
        System.out.println(dev2);

        System.out.println("\nForgetting w/ null language test case");
        //-->(null -> forgetProLang() => [Java, Rust, Python])
        dev.forgetProLang(null);
        System.out.println(dev);

        System.out.println();
        dev2.forgetProLang(null);
        System.out.println(dev2);

        System.out.println("\ngetArray().add() test case");
        //-->(Scala -> learnProLang().add(_) => [Java, Rust, Python])
        dev.getProLang().add("Scala");
        System.out.println(dev);

        System.out.println();
        dev2.getProLang().add("Python");
        System.out.println(dev2);

        System.out.println("\nFired Method testing");
        //--> (fired() => {'Unemployed'}
        dev.fired();
        System.out.println(dev);

        System.out.println();
        dev2.fired();
        System.out.println(dev2);

        System.out.println("\nChanged jobs Method testing");
        //--> (null -> changedJobs => {'Unemployed'}) -> what ever the last value was will remain
        dev.changedJobs(null);
        System.out.println(dev);

        System.out.println();
        dev2.changedJobs(null);
        System.out.println(dev2);

        System.out.println("\nTesting Getters and setters");
        System.out.println(dev.getProgrammerName());
        System.out.println(dev2.getProgrammerName());

        dev.setProgrammerName("Linux Lord");
        dev2.setProgrammerName("GNU Lord");

        System.out.println(dev.getProgrammerName());
        System.out.println(dev2.getProgrammerName());

        System.out.println(dev.getProLang());
        System.out.println(dev2.getProLang());

        System.out.println(dev.getProgrammerCompany());
        System.out.println(dev2.getProgrammerCompany());


    }
}
