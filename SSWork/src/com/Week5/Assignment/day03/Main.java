package com.Week5.Assignment.day03;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Athlete tomBrady2 = new Athlete("Thomas Edward patrick Brady Jr", (short) 1, (short)0); // 100% case
        Athlete rayLewis = new Athlete("Raymond Anthony Lewis Jr", (short) 127, (short)100); //
        Athlete rayLewis2 = new Athlete("Raymond Anthony Lewis Jr", (short) 100, (short)127); //Win loss swapped
        Athlete lamarJackson = new Athlete("Lamar Demeatrice Jackson jr", (short) 46, (short) 20);
        Athlete lamarJackson1 = new Athlete("Lamar Demeatrice Jackson jr", (short) 999, (short) 1);
        Athlete tomBrady = new Athlete("Thomas Edward patrick Brady Jr", (short) 243, (short)73);
        //Athlete checkSum = new Athlete(null, (short)87, (short)50);
        //Athlete checkSum2 = new Athlete("negValue", (short)-2, (short)50);
        //Athlete checkSum3 = new Athlete("negValue", (short)3, (short)-4);


        LinkedList<Athlete> athletes = new LinkedList<Athlete>();
        athletes.add(rayLewis2);
        athletes.add(lamarJackson);
        athletes.add(tomBrady2);
        athletes.add(rayLewis);
        athletes.add(tomBrady);
        athletes.add(lamarJackson1);


        athletes.sort(new WinLossPercentageComparator());
        printer(athletes);
        System.out.println();



    }

    private static void printer(LinkedList<Athlete> athletes) {
        int counter = 0;
        for (Athlete athlete : athletes) {
            ++counter;
            System.out.println(counter + "" + athlete +" Average: "+ athlete.getAverage());
        }
    }
}
