package com.week4.day2.lesson;

import java.util.LinkedList;

public class DealershipProject {


    /*
        Car Dealership mini-project

        Objects
        A customer can buy a vehicle
        A salesperson can sell a vehicle
        The dealership can buy vehicle and add them to its inventory
        We want to keep track of all the money and who owns what

        What classes do we need?
        -- Vehicle
        -- Dealership
        -- Salesperson
        -- Customer

     */
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Dodge", "Ram", (short)2013, "Pickup", "Blue", "Gasoline", 49999.99);
        Vehicle vehicle2 = new Vehicle("Toyota", "Corolla", (short)2016, "Sedan", "Grey", "Gasoline", 19999.99);
        Vehicle vehicle3 = new Vehicle("Kia", "Soul", (short)2015, "Compact SUV", "Blue", "Gasoline", 15999.99);

        LinkedList<Vehicle> startingInventory = new LinkedList<Vehicle>();
        startingInventory.add(vehicle1);
        startingInventory.add(vehicle2);
        startingInventory.add(vehicle3);

        Dealership dealership1 = new Dealership("Bikini Bottom", "Under the Sea", startingInventory, 20_000_000.0);

        System.out.println("Out dealership to start:");
        System.out.println(dealership1);

        System.out.println();
        Salesperson salesperson1 = new Salesperson("Bob", 13.95, 0.05);
        System.out.println("Our salesperson to start:");
        System.out.println(salesperson1);
        System.out.println();

        Customer customer1 = new Customer("Mr. Krabs", 30000.0, true, null, (short)750);
        System.out.println("Our customer to start:");
        System.out.println(customer1);
        System.out.println();

        customer1.buy(vehicle3, dealership1, salesperson1);


        System.out.println("Out dealership to end:");
        System.out.println(dealership1);

        System.out.println();
        System.out.println("Our salesperson to end:");
        System.out.println(salesperson1);
        System.out.println();

        System.out.println("Our customer to end:");
        System.out.println(customer1);
        System.out.println();

       // Vehicle testVehicle = new Vehicle("Dodge", "Ram", (short)2013, "Pickup", "Blue", "Gasoline", 49999.99);

        //System.out.println(testVehicle);

        //LinkedList<Vehicle> starterList = new LinkedList<Vehicle>();
        //starterList.add(testVehicle);

        //Dealership myDealership = new Dealership("EngineKnock Motors", "Camden, NJ", starterList, 7890.00);
        //System.out.println(myDealership);

        //Salesperson newSalesperson = new Salesperson("Novah", 999999.99, .1);
        //System.out.println(newSalesperson);

        //Customer newCustomer = new Customer("Steely Dan", 1495.25, false, starterList, (short)7 );
        //System.out.println(newCustomer);






    }

}
