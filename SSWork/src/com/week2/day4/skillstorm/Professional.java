package com.week2.day4.skillstorm;

public abstract class Professional extends Person{

    private String degreeName;

    public Professional(){
        super();
    }

    public Professional(String name, byte age, String degreeName){
        super(name, (byte)age);
        this.degreeName = degreeName;

    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }
}
