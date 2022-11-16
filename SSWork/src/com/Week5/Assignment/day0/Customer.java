package com.Week5.Assignment.day0;

public class Customer {

    String name;
    IceCream flavor;

    public Customer() {
    }

    public Customer(String name, IceCream flavor) {
        setName(name);
        setFlavor(flavor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is not valid, Please check Customer name for either a null value or an empty String");
        }
        this.name = name;
    }

    public IceCream getFlavor() {
        return flavor;
    }

    public void setFlavor(IceCream flavor) {
        if (flavor == null) {
            throw new IllegalArgumentException("This flavor is not valid, please check for null values");
        }
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "\n\t\tCustomer{" +
                "\n\t\t\tname='" + name + '\'' +
                ", \n\t\t\tflavor=" + flavor +
                '}';
    }
}
