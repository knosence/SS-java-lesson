package com.Week5.day04.lesson;

import java.util.Comparator;

public class ThreadCountComparator implements Comparator<Suit> {

    public int compare(Suit o1, Suit o2) {
        return o1.getThreadCount() - o2.getThreadCount();
    }
}
