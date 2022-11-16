package com.week4.day4.lesson;

public class ObjectsEquals {
    public static void main(String[] args) {

        System.out.println("Is 1 equal to 1?");
        System.out.println(1 == 1); // Eval = true

        System.out.println();
        System.out.println("Is 'Skittle' equal to 'Skittle'?");
        System.out.println("Skittle" == "Skittle");

        System.out.println();
        Skittle skittle1 = new Skittle("Blue", "The Rainbow");
        Skittle skittle2 = new Skittle("Blue", "The Rainbow");

        System.out.println("Is skittle 1 equal to skittle2?");
        System.out.println(skittle1 == skittle2);
        // this now works, because we have overridden the .equals() method inside of Skittle
        System.out.println(skittle1.equals(skittle2));
        // cannot do this with the simple version of the override, since we cannot cast Object to Skittle
        //System.out.println(skittle1.equals(new Object()));

        System.out.println();

        System.out.println("No, because what's being compared are those memory addresses:");
        System.out.println(skittle1);
        System.out.println(skittle2);

        // we must override the .equals() method for our Skittle object

        System.out.println();
        System.out.println(skittle1.equals(skittle2));
    }


}
