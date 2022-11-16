package com.Week6.day02.Lesson;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPractice {

    /*
        What is an iterator?
        - alternative to
        -- stream
        -- loops - while, for, for-each
        --- or recursion

        - uses iteration (not recursion to transverse a collection)
        -- collection - list, sets, array, maps

        Pros
        - we can start and stop and continuing from where left off
        - we can remove safely in the middle of iterating
     */

    public static void main(String[] args) {
        LinkedList<String> programmingLanguages = new LinkedList<>(Arrays.asList("Rust", "Python", "Ruby", "Go", "C#", "Pascal", "Java", "JavaScript"));

        Iterator<String> iter = programmingLanguages.iterator();
        String lang1 = iter.next();
        String lang2 = iter.next();
        System.out.println(lang1);
        System.out.println(lang2);
        System.out.println("More? " + iter.hasNext());
        String lang3 = iter.next();
        System.out.println(lang3);

        // go through all the rest
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        System.out.println();
        System.out.println(programmingLanguages);
        //for (int i = 0; i < programmingLanguages.size(); i++) {
        //    if (programmingLanguages.get(i).equals("java")) {
        //        programmingLanguages.remove(i); // do not do, not safe to remove
        //    } else {
        //        System.out.println(programmingLanguages.get(i));
        //    }
        //}
        Iterator<String> iter2 = programmingLanguages.iterator();
        while (iter2.hasNext()) {
            String language = iter2.next();
            if (language.equals("Java")) {
                iter2.remove();
            }
        }

        System.out.println(programmingLanguages);

    }

}
