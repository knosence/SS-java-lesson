package com.skillstorm;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(true, "Mazda", (short) 2016, "CX-5", (byte) 4, false);
        System.out.println(car.fuelRemainInTank());
        System.out.println(car.move());
        System.out.println(car.turnOn());
        System.out.println(car.move());
        System.out.println(car.fuelRemainInTank());
        System.out.println(car.move());
        System.out.println(car.move());
        System.out.println(car.move());
        System.out.println(car.move());
        System.out.println(car.move()); // no fuel
        car.refuel();
        System.out.println(car.move()); // won't move because needs to be turned on
        System.out.println(car.turnOn());
        System.out.println(car.turnOn()); // already on
        System.out.println(car.move()); // will move
        System.out.println(car.turnOff()); // turns off
        System.out.println(car.turnOff()); // already off


        System.out.println();

        Car tesla = new Car(false, "Tesla", (short) 2020, "Model Plaid", (byte) 4, false);
        System.out.println(tesla.fuelRemainInTank());
        System.out.println(tesla.move());
        System.out.println(tesla.turnOn());
        System.out.println(tesla.move());
        System.out.println(tesla.fuelRemainInTank());
        System.out.println(tesla.move());
        System.out.println(tesla.move());
        System.out.println(tesla.move());
        System.out.println(tesla.move());
        System.out.println(tesla.move()); // no fuel
        tesla.refuel();
        System.out.println(tesla.move()); // won't move because needs to be turned on
        System.out.println(tesla.turnOn());
        System.out.println(tesla.turnOn()); // already on
        System.out.println(tesla.move()); // will move
        System.out.println(tesla.turnOff()); // turns off
        System.out.println(tesla.turnOff()); // already off

        System.out.println();

        Truck ford150 = new Truck(true, "Ford", (short) 2018, "150", (byte) 2, false, true);
        System.out.println(ford150.fuelRemainInTank());
        System.out.println(ford150.move());
        System.out.println(ford150.turnOn());
        System.out.println(ford150.move());
        System.out.println(ford150.fuelRemainInTank());
        System.out.println(ford150.move());
        System.out.println(ford150.towAway("stove")); // uses 40% of tank
        System.out.println(ford150.move());
        System.out.println(ford150.move()); // no fuel
        ford150.refuel();
        System.out.println(ford150.move()); // won't move because needs to be turned on
        System.out.println(ford150.turnOn());
        System.out.println(ford150.turnOn()); // already on
        System.out.println(ford150.move()); // no fuel
        System.out.println(ford150.turnOff()); // turns off
        System.out.println(ford150.turnOff()); // already off
    }

}
