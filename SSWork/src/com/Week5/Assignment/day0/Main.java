package com.Week5.Assignment.day0;

public class Main {

    public static void main(String[] args) {
        IceCreamShop shop = new IceCreamShop();
        System.out.println("Starting :" + shop);
        IceCream vanilla = new IceCream("Vanilla");
        IceCream chocolate = new IceCream("Chocolate");
        IceCream strawberry = new IceCream("Strawberry");
        IceCream butterPecan = new IceCream("Butter Pecan");
        //IceCream noTaste = new IceCream(null);

        Customer one = new Customer("CustomerOne", vanilla);
        Customer two = new Customer("CustomerTwo", chocolate);
        Customer three = new Customer("CustomerThree", strawberry);
        Customer four = new Customer("CustomerFour", butterPecan);
        Customer five = new Customer("CustomerFive", butterPecan);
        Customer six = new Customer("CustomerSix", vanilla);
        //Customer seven = new Customer(null, null);

        shop.addCustomer(one);
        shop.addCustomer(two);
        shop.addCustomer(three);
        shop.addCustomer(four);
        shop.addCustomer(five);
        shop.addCustomer(six);
        //shop.addCustomer(null);

        System.out.println(shop);
        System.out.println();
        shop.addFlavor(vanilla);
        shop.addFlavor(chocolate);
        shop.addFlavor(strawberry);
        shop.addFlavor(butterPecan);
        //shop.addFlavor(null);

        System.out.println(shop);
        System.out.println();
        shop.serviceCustomer();
        shop.serviceCustomer();
        shop.serviceCustomer();
        shop.serviceCustomer();
        shop.serviceCustomer();
        shop.serviceCustomer();

        System.out.println(shop);
        System.out.println();
        shop.removeFlavor(butterPecan);
        shop.removeFlavor(chocolate);
        shop.removeFlavor(strawberry);
        shop.removeFlavor(vanilla);
        //shop.removeFlavor(null);

        System.out.println(shop);

    }


}
