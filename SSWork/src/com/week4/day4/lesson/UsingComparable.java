package com.week4.day4.lesson;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class UsingComparable {
    public static void main(String[] args) {
        // the comparable interface
        // we want to be able to use java's collections.sort() method

        // the Integer.compare(int x, int y) method takes two numbers and returns:
        // 1 if the first number is larger
        // 0 if they are equal
        // -1 if the first is smaller
        System.out.println(Integer.compare(7,5));
        System.out.println(Integer.compare(5,5));
        System.out.println(Integer.compare(3,5));

        System.out.println();

        // the .compareTo(String) method, when calling on a String, returns:
        //a positive number if the first string is later in alpha order
        // 0 if it's the same
        // a negative number if the first string is earlier in alpha order
        System.out.println("Comparing strings");
        System.out.println("Mike".compareTo("Anna"));
        System.out.println("Mike".compareTo("Mike"));
        System.out.println("Anna".compareTo("Mike"));
        // can create problems with upper- and lowercase letters
        // can use .toLowerCase() or .compareToIgnoreCase() methods to convert strings to lowercase before comparison
        System.out.println("Zaaa".toLowerCase().compareTo("aaaZ"));
        System.out.println("Zaaa".compareToIgnoreCase("aaaZ"));

        System.out.println();
        // using Collections.sort to sort a list by age or name
        LinkedList<Person> myPeople = new LinkedList<Person>();

        myPeople.add(new Person("Gandalf", 329));
        myPeople.add(new Person("Jones", 56));
        myPeople.add(new Person("Brian", 27));
        myPeople.add(new Person("Emily", 37));
        myPeople.add(new Person("Peter", 1));

        System.out.println(myPeople);

        //using the .compareTo() method of the items in the class
        // the class MUST override the
        // this usses the sorting method coed into the class itself
        //Collections.sort(myPeople);

        System.out.println(myPeople);

        // using the comparator interface
        // what if we want to be able to sort by more than one property?
        // using our example, we want to choose at runtime to sort by name OR by age?
        // can't do this with the comparable interface


        System.out.println();

        // must instantiate our object with the new sorting methods
        NameComparer nameComparer = new NameComparer();
        AgeComparer ageComparer = new AgeComparer();

        // this uses whichever sorting method we indicate with the second parameter
        Collections.sort(myPeople, nameComparer);
        // whichever one we sort by second will group those together, keeping the sort order of the other from the first group
        Collections.sort(myPeople, ageComparer);

        System.out.println(myPeople);

    }
}
