package com.week2.day4.skillstorm;

public class Teacher extends Professional{

    private String job = "Nurse";
    private byte age;
    private String name;

    public Teacher(String name, byte age, String showDegree) {
        super(name, age, showDegree);
    }

    @Override
    public String showDegree() {

        return null;
    }

    @Override
    public void declareJob() {
        System.out.println(job);
    }

    @Override
    public void growUp() {
        super.setAge((byte) (super.getAge() + 3));
    }
}
