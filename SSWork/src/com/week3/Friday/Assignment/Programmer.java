package com.week3.Friday.Assignment;

import java.util.ArrayList;

public class Programmer {
    /*
   Create a class, Programmer, that describes a real-life programmer. The Programmer class should have the ability to learn and forget programming languages in addition to having unique properties such as the person's name and the company they work for. The class should have its data encapsulated and the languages that a person knows should be stored in an ArrayList of Strings and should not allow entry of a null value.

Requirements:

Defines properties such as languages, name, and the company the Programmer works for
Have the data be full encapsulated via private fields and public getters and setters
Have the ability to create multiple Programmer objects and have their data be independent of one another
Possess the ability to learn and forget programming languages at will through publicly accessible methods on the Programmer class
Prevent the addition of null entities to the programming languages array list
Bonus Challenge:

Override the toString method to allow the printing of a Programmer object
     */

    private ArrayList<String> proLang;
    private String programmerName = "No Name";
    private String programmerCompany = "Unemployed";

    public Programmer(){
        super();
    }

    public Programmer(ArrayList<String> prolang, String programmerName, String programmerCompany){
        this.proLang = prolang;
        this.programmerName = isValid(programmerName, this.programmerName);
        this.programmerCompany = isValid(programmerCompany, this.programmerCompany);
    }

    public ArrayList<String> getProLang() {
        return new ArrayList<>(this.proLang);
    }

    public void forgetProLang(String proLang) {
        if (proLang == null || proLang.isEmpty()) return;
        this.proLang.remove(proLang);
    }

    public void learnProLang(String proLang) {
        if (proLang == null || proLang.isEmpty()) return;
        this.proLang.add(proLang);
    }


    public String getProgrammerName() {
        String name = this.programmerName;
        return name;
    }

    public void setProgrammerName(String name) {
        this.programmerName = isValid(name, this.programmerName);
    }

    public String getProgrammerCompany() {
        String company = this.programmerCompany;
        return company;
    }

    public void fired(){
        this.programmerCompany = "Unemployed";
    }

    public void changedJobs(String newJob){
        this.programmerCompany = isValid(newJob, "Unemployed");
    }

    public String isValid(String value, String defaultValue){
        if (value == null || value.isEmpty()) return defaultValue;
        else return value;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "proLang=" + proLang +
                ", programmerName='" + programmerName + '\'' +
                ", programmerCompany='" + programmerCompany + '\'' +
                '}';
    }
}
