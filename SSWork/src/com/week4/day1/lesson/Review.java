package com.week4.day1.lesson;

import com.week3.Friday.Lesson.BetterBilliardBall;

public class Review {
    public static void main(String[] args) {

        // Stack and Heap

        // for the Stack, local variables and their values are stored here

        // the minute this loop is complete, the i variable is removed from the stack
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }

        // cannot access i here, because i was removed from the Stack after the for loop completed
        // System.out.println(i);

        System.out.println(add(5, 7));

        // cannot do either one of these, because these local variables from the add() method
        // were removed from the Stack after the a() method completed
        //System.out.println(first);
        //System.out.println(sum);

        // The ob variable and its value (the method location lives in the stack
        //BUT the object itself lives in the Heap
        Object ob = new Object();
        System.out.println(ob);

        //new BilliardBall object that lives in the Heap
        // its values for color, number, and solid ALSO live on the Heap
        // the local variable values for the properties that we used in the constructor
        BilliardBall myNewBall = new BilliardBall("Black", (byte)8, true);

        //CAN do this if color is public because its value lives in the Heap
        //System.out.println(myBall.color);

        //Cannot do this because this local constructor variable lived in the Stack and is now gone
        //System.out.println(myBall.myColor);

        System.out.println(myNewBall);

        //when I do this, the BilliadBall referred to by myBall is now for garbage collection
        // no references to it remain
        //myNewBall = null;

        System.out.println(myNewBall);
        myNewBall.setNumber((byte)13);
        System.out.println(myNewBall);


        BetterBilliardBall myBetterBall = new BetterBilliardBall((byte)13);
        myBetterBall.setNumber((byte)6).getPattern();
        System.out.println(myBetterBall.getColor());

        BetterBilliardBall myCueBall = new BetterBilliardBall((byte)-50);

        System.out.println(myCueBall.getColor());
    }

    public static int add(int first, int second) {
        return first + second;
    }
}
