package com.week7.day1.lesson;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class IceCreamShop {

    // ice cream cost
    private final double ICE_CREAM_COST = 4.5;
    // properties
    // queue for customers
    private final Queue<Customer> customerQueue = new LinkedList<Customer>();
    // total earnings
    private double totalEarnings = 0;
    // HashSet of available flavors (prevent duplicates)
    private HashSet<String> availableFlavors = new HashSet<String>();

    // Constructor deosn't need to initialize anything
    public IceCreamShop() {
        super();
    }

    //
    // method called addcustomer
    //- adds a customer to a queue
    public void addCustomer(Customer customer) {
        if (customer != null)
            customerQueue.offer(customer); //already validates null vals
    }

    //method called serviceCustomers
    // takes first customer, adds cost to total earnings, removes from queue
    // prevent Customer from purchasing unavailable flavor by throwing exception
    // prevent from purchasing when flavor no availabl (exception)
    // exception when trying to service when queue is empty
    public void serviceCustomer() throws Exception {
        if (!customerQueue.isEmpty()
                && customerQueue.peek().getFlavor() != ""
                && availableFlavors.contains(customerQueue.peek().getFlavor())) {
            customerQueue.poll();
            totalEarnings += ICE_CREAM_COST;
        } else {
            throw new Exception("Service No Possible");
        }
    }

    // method called addFlavor
    // add a flavor to the list of available flavors
    public void addFlavor(String flavor) {
        if (flavor != null && !flavor.isEmpty())
            availableFlavors.add(flavor);
    }

    //method called removeflavor
    // removes a flavor from the list of available flavor
    public void removeFlavor(String flavor) {
        availableFlavors.remove(flavor);
    }


    public static void main(String[] args) throws Exception {
        IceCreamShop myShop = new IceCreamShop();
        myShop.addCustomer(new Customer("Vanilla"));
        myShop.addCustomer(null);
        System.out.println(myShop.customerQueue);

        myShop.addFlavor("Vanilla");
        myShop.addFlavor("");
        myShop.addFlavor(null);
        myShop.removeFlavor("Vanilla");
        myShop.removeFlavor("Chocolate");
        System.out.println(myShop.availableFlavors);

        myShop.addFlavor("Vanilla");
        myShop.addFlavor("Chocolate");
        myShop.addFlavor("Strawberry");
        System.out.println(myShop.availableFlavors);

        myShop.addCustomer(new Customer("Strawberry"));
        myShop.addCustomer(new Customer("Chocolate"));
        myShop.addCustomer(new Customer("Rocky Road"));
        System.out.println(myShop.customerQueue);

        System.out.println(myShop.totalEarnings);
        myShop.serviceCustomer();
        myShop.serviceCustomer();
        myShop.serviceCustomer();
        System.out.println(myShop.totalEarnings);
        System.out.println(myShop.customerQueue);


    }


}
