package com.Week5.Assignment.day0;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.*;

public class IceCreamShop {

    private static Queue<Customer> customerQueue;
    private static HashSet<IceCream> iceCreamSelection;

    private static double funds = 0;

    public IceCreamShop() {
        customerQueue = new LinkedList<Customer>();
        iceCreamSelection = new HashSet<IceCream>();

    }

    public void addCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Please check the customer's name for either a null value or an empty string");
        }
        customerQueue.add(customer);
        System.out.println("### Customer " + customer.getName() + " wants some iceCream");
    }


    public void serviceCustomer() {
        if (customerQueue.isEmpty()) {
            throw new IllegalArgumentException("The Line is empty. Please wait until a customer is in line to service them");
        }
        Customer customerToService = customerQueue.peek();
        if (iceCreamSelection.contains(customerToService.flavor)) {
            funds = funds + customerToService.flavor.getValue();
            System.out.println("=== Customer " + customerToService.getName() + " was given " + customerToService.flavor.getFlavor());
            customerQueue.poll();
        }
    }

    public void addFlavor(IceCream flavor){
        // check if flavor is valid (not null)
        // no need to check if it is already in the set because of... set.
        if (flavor == null) {
            throw new IllegalArgumentException("Please check the flavor you are adding, it may contain a null... actually is does have a null, I was trying to be nice.");
        }
        iceCreamSelection.add(flavor);
        System.out.println("+++ The " + flavor + " flavor was added to selection");
    }

    public void removeFlavor(IceCream flavor) {
        // check if flavor is in set and remove
        // check if input is null or empty
        if (flavor == null || iceCreamSelection.isEmpty()) {
            throw new IllegalArgumentException("Please check the flavor you want to remove, it may contain a null value or is empty");
        }
        if (!iceCreamSelection.contains(flavor)) {
            throw new IllegalArgumentException("This flavor does not exist in iceCream Selection");
        }
        iceCreamSelection.remove(flavor);
        System.out.println("--- The " + flavor.getFlavor() + " was removed from selection");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamShop that = (IceCreamShop) o;
        return Objects.equals(customerQueue, that.customerQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerQueue, iceCreamSelection);
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "\n\t-customerQueue=" + customerQueue +
                ", \n\t-iceCreamSelection=" + iceCreamSelection +
                ", \n\t-funds= " + funds +
                '}';
    }
}
