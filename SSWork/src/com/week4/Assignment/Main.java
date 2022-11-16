package com.week4.Assignment;

import sun.awt.X11.XStateProtocol;

public class Main {
    public static void main(String[] args) {

        //  have the ability to store any type of non-primitive data type through use of generics
        StackAssignment<String> stringStack = new StackAssignment<String>();
        StackAssignment<Integer> intStack = new StackAssignment<Integer>();

        System.out.println(
                "String Stack: \n" + stringStack + "\n" +
                "Integer Stack: \n" + intStack + "\n"
        );

        // contains a push method that adds an element to the top of the stack
        // BONUS: Add a max capacity to the stack that prevents the addition of more elements once the stack's capacity has been reached
        stringStack.push("ElementOne");
        stringStack.push("ElementTwo");
        stringStack.push("ElementThree");
        stringStack.push("ElementFour");
        stringStack.push("ElementFive");
        stringStack.push("ElementSix");

        intStack.push(14);
        intStack.push(8);
        intStack.push(75);
        intStack.push(0);
        intStack.push(38);
        intStack.push(42);

        System.out.println(
                "\nString Stack: \n" + stringStack + "\n" +
                        "Integer Stack: \n" + intStack + "\n"
        );

        // contain a pop method that removes and returns the element on the top of the stack
        stringStack.pop();
        stringStack.pop();
        intStack.pop();

        System.out.println(
                "\nString Stack: \n" + stringStack + "\n" +
                        "Integer Stack: \n" + intStack + "\n"
        );

        // contains a peek method that returns the element on the top of the stack
        System.out.println(stringStack.peek());
        System.out.println(intStack.peek());

        // Contain a size method that returns the total amount of elements currently on the stack
        System.out.println();
        System.out.println(stringStack.size());
        System.out.println(intStack.size());

        //Contain a isEmpty method that returns true if the stack is empty and false otherwise
        System.out.println();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        System.out.println(stringStack.isEmpty());
        System.out.println(intStack.isEmpty());

        // Handle situations where the user tries to pop the top element off of an empty stack by throwing an exception
        System.out.println();
        stringStack.pop();


    }



}
