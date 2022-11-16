package com.week4.day5.lesson;

public class Person {

    private String name;
    private int age;
    private boolean isAlive;

    public Person() {
        super();
    }

    public Person(boolean isAlive, String name, int age) {
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.week4.day5.lesson.Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
