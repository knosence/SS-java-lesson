package com.week4.day5.lesson;

import java.util.Comparator;

public class StringComparer implements Comparator<String> {


    @Override
    public int compare(String string1, String string2) {
        return string1.compareToIgnoreCase(string2);
    }
}
