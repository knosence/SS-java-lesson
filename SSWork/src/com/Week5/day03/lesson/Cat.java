package com.Week5.day03.lesson;

public class Cat implements Comparable{

    String name;
    int cuteness;

    public Cat(String name, int cuteness) {
        this.name = name;
        this.cuteness = cuteness;
    }

    @Override
    public int compareTo(Object o) {
        Cat other = (Cat) o;
        if (this.cuteness < other.cuteness){
            return -1;
        } else if (this.cuteness > other.cuteness){
            return 1;
        } else return 0;
    }
}
