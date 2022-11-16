package com.week2.day5.skillstorm;

public class CoffeeMug {
    private byte volumeInOunces;
    private String message;
    private boolean insulated;

    public CoffeeMug(){
        super();
    }

    public CoffeeMug(byte volumeInOunces, String message, boolean insulated) {
        this.volumeInOunces = volumeInOunces;
        this.message = message;
        this.insulated = insulated;
    }



    @Override
    public String toString() {
        return "CoffeeMug{" +
                "volumeInOunces=" + volumeInOunces +
                ", message='" + message + '\'' +
                ", insulated=" + insulated +
                '}';
    }

    public byte getVolumeInOunces() {
        if (volumeInOunces <= 127 && volumeInOunces >= -128){
            return (byte)volumeInOunces;
        } else {
            System.out.println("Volume can't fit into a byte");
            return 0;
        }
    }

    public void setVolumeInOunces(byte volumeInOunces) {
        this.volumeInOunces = volumeInOunces;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message.length() < 8) System.out.println("Too short...");
        else this.message = message;
    }

    public boolean isInsulated() {
        return insulated;
    }

    public void setInsulated(boolean insulated) {
        this.insulated = insulated;
    }
}
