package com.Week5.Assignment.day01;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Lord of the Flies", new Person("William Golding", 9191911));
        Book book2 = new Book("The Shining", new Person("Steven King", 9211947));
        Book book3 = new Book("Herry Potter", new Person("JK Rowling", 7311965));

        HashSet<Book> books = new HashSet<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book1);


        System.out.println(book1.equals(book1));
        System.out.println(book1.equals(book2));

        System.out.println();
    }
}
