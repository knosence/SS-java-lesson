package com.week2.day4.skillstorm;

public class Nurse extends Professional{

    private String job = "Nurse";
    private String name;
    private byte age;

    public Nurse(){
        super();
    }
    public Nurse(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Nurse(String name, byte age, String showDegree) {
        super(name, age, showDegree);


    }

    @Override
    public String showDegree() {
        return super.getDegreeName();
    }


    //this class, if it is not an abstract class, MUST implement all abstract methods from its parent

    @Override
    public void declareJob() {
        System.out.println(job);
    }

    @Override
    public void growUp() {
        super.setAge((byte)(super.getAge()+ 1));
    }
}
