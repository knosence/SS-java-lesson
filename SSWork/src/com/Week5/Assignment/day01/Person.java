package com.Week5.Assignment.day01;

public class Person {

    private String name;
    private final int DOB;

    public Person() {
        name = "no one";
        DOB = 1970;
    }

    public Person(String name, int DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDOB() {
        return DOB;
    }
    
    @Override
    public int hashCode(){
        final int prime = 8;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = (prime * result) + (DOB);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
