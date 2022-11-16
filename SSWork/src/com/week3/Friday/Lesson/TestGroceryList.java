package com.week3.Friday.Lesson;

import java.util.ArrayList;

/**
 * A class that holds a list of groceries
 *
 * @author NaDario
 */
public class TestGroceryList {
    public static void main(String[] args) {
        // All Objects
        // 1. in a constructor -- make a copy dont use their copy
        // 2 in a setter -- make a copy dont use their copy
        // 3. in a getter -- don't return your copy, make a copy to return

        ArrayList<String> need = new ArrayList<>();
        need.add("coffee");
        need.add("toothpaste");
        need.add("eggs");


        GroceryList groceryList = new GroceryList(need);
        System.out.println(groceryList.getGroceriesList());

        need.add("captain crunch cereal");
        System.out.println();

        //Dont let them
        System.out.println(groceryList.getGroceriesList());

        // someone wants to see my list
        groceryList.getGroceriesList().add(null);
    }
}
