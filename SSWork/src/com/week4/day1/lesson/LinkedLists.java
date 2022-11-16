package com.week4.day1.lesson;

import com.week3.Friday.Lesson.BetterBilliardBall;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
        //if I dont declare a type, it defualts to a LinkedList of Objects
        // LinkedList myList = new LinkedList();

        // a LinkedList MUST contain objects of some kind, Cannot contain primitives (unless inside Wrapper class)

        //declare a type inside the carets
        LinkedList<String> myStringList = new LinkedList<String>();

        //an empty list by defualt, not null
        System.out.println(myStringList);

        //adding each item to the end of the LinkedList
        myStringList.add("Football");
        myStringList.add("Cheesecake");
        myStringList.add("Paper Cut");

        System.out.println(myStringList);

        //insert an item in the middle
        myStringList.add(1, "Baby Napkins"); // Syntax here is first parameter = index where you want to insert; all items at/after that goet moved to the right

        System.out.println(myStringList);

        //removing an item from the beginning
        myStringList.remove();

        System.out.println(myStringList);

        //removing an item from the middle
        myStringList.remove(1);

        System.out.println(myStringList);

        myStringList.add("Michael Douglas");
        myStringList.add("Gwar");
        myStringList.add("Earlobe Wax");
        myStringList.add("Fish Cakes");

        System.out.println(myStringList);

        //removing the item at the end
        myStringList.removeLast();

        System.out.println(myStringList);

        // removing an item by searching for it, then using the index
        myStringList.remove(myStringList.indexOf("Gwar"));

        System.out.println(myStringList);

        myStringList.add("Gwar");
        myStringList.add("Gwar");
        myStringList.add("Gwar");
        myStringList.add("Gwar");
        myStringList.add("Gwar");

        System.out.println(myStringList);

        // using removeAll()
        LinkedList<String> myListToRemove = new LinkedList<String>();
        myListToRemove.add("Gwar");
        myListToRemove.add("Paper Cut");

        // checking to see if myStringList has a single value in it
        System.out.println(myStringList.contains("Earlobe Wax"));

        //checking to see if it has ll of a collection of values in it
        System.out.println(myStringList.containsAll(myListToRemove));
        // remove All instances of All values in one list in it
        myStringList.removeAll(myListToRemove);

        System.out.println(myStringList);

        // can I have a linkedList of LinkedList? YES?
        LinkedList<LinkedList<String>> myListOfLists = new LinkedList<LinkedList<String>>() ;

        myListOfLists.add(myStringList);
        myListOfLists.add(myListToRemove);

        System.out.println(myListOfLists);


    }
}
