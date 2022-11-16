package com.week4.day2.lesson;

import java.util.LinkedList;

//this class represents an individual customer with properties/methods relevant to our project
public class Customer extends Person{

    // properties
    private boolean tradeIn;
    private LinkedList<Vehicle> collection;
    private short creditRating;


    // constructors
    public Customer() {
        super();
        this.collection = new LinkedList<Vehicle>();
    }

    public Customer(String name, double netWorth, boolean tradeIn, LinkedList<Vehicle> collection, short creditRating) {
        super(name, netWorth);
        this.tradeIn = tradeIn;
        if (collection == null) {
            this.collection = new LinkedList<Vehicle>();
        } else {
            this.collection = collection;
        }
        this.creditRating = creditRating;
    }

    public boolean isTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(boolean tradeIn) {
        this.tradeIn = tradeIn;
    }

    public LinkedList<Vehicle> getCollection() {
        return collection;
    }

    public void setCollection(LinkedList<Vehicle> collection) {
        this.collection = collection;
    }

    public short getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(short creditRating) {
        this.creditRating = creditRating;
    }

    public void buy(Vehicle vehicle, Dealership dealership, Salesperson salesperson) {
        // check if the dealership has the vehicle [V]
        // check if the customer has enough money [V]
        // check if the customer has a tradein []
        // check the customer's credit rating [V]

        // if the inventory at dealership the customer went to has at least one of the vehicle the customer asked about in stock, continue
        if (dealership.getInventory().contains(vehicle)) {
            // if they have enough money or a good credit rating, continue
            if (this.getNetWorth() >= vehicle.getPrice() || this.creditRating >= 400) {
                double finalPrice = vehicle.getPrice();

                // if they have a trading, substract $5,000 from the final price
                if (tradeIn) {
                    finalPrice = finalPrice - 5000;
                    //if we end up giving the customer money, call it even
                    if (finalPrice < 0) {
                        finalPrice = 0;
                    }
                }

                // subtracts final price from customer's net work
                this.setNetWorth(this.getNetWorth() - finalPrice);

                // adds commission to salesperson
                salesperson.setNetWorth(salesperson.getNetWorth() + (salesperson.getCommission()) * finalPrice);

                // add remaining value to dealership's cash on hand
                dealership.setCashOnHand(dealership.getCashOnHand() + (finalPrice - salesperson.getCommission() * finalPrice));

                // add vehicle to the customer's collection
                this.collection.add(vehicle);

                // remove the vehicle from the dealership's inventory
                dealership.getInventory().remove(vehicle);

            } else {
               System.out.println("Sorry, the finance don't work out this time. How about a unicycle?");
           }
        } else {
            System.out.println("Sorry, not in stock... anything else catch your eye?");
        }
    }

    @Override
    public String toString() {
        return "com.week4.day2.lesson.Customer{" +
                "name='" + this.getName() + '\'' +
                ",\n netWorth= $" + this.getNetWorth() +
                ",\n tradeIn=" + tradeIn +
                ",\n collection=" + collection +
                ",\n creditRating=" + creditRating +
                '}';
    }
}