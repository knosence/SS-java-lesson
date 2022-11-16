package com.Week5.Assignment.day0;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private static final double value = 2.5;

    public IceCream() {
    }

    public IceCream(String flavor) {
        setFlavor(flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public double getValue() {
        return value;
    }

    public void setFlavor(String flavor) {
        if (flavor == null || flavor.isEmpty()) {
            throw new IllegalArgumentException("Please Check flavor and remove null values or fill in empty strings");
        }
        this.flavor = flavor;
    }


    @Override
    public String toString() {
        return " IceCream{" +
                "flavor='" + flavor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Objects.equals(getFlavor(), iceCream.getFlavor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor());
    }
}
