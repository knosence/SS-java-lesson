package com.week3.Friday.Lesson;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GroceryList {
    /**
     * Java doc comment
     */
    private ArrayList<String> groceriesList;

    public GroceryList() {
        this.groceriesList = new ArrayList<>();
    }

    public GroceryList(ArrayList groceries) {
        this.groceriesList = copyValid(new ArrayList<>(groceriesList)); // copy the values and create a new object
        // this.groceriesList = groceries; // copies the reference
    }

    public ArrayList<String> getGroceriesList() {
        return new ArrayList<>(this.groceriesList);
    }

    public void add(String item) {
        if (item == null || item.isEmpty())
            return; // returns nothing
        groceriesList.add(item); // wont run if nothing is added
    }


    @Override
    public String toString() {
        return "GroceryList{" +
                "groceriesList=" + groceriesList +
                '}';
    }

    private ArrayList<String> copyValid(ArrayList<String> items) {
        ArrayList<String> validItems = new ArrayList<>();
        for (String item : items) {
            if (item != null) validItems.add(item);
            else continue;
        }

        return items;
    }
}
