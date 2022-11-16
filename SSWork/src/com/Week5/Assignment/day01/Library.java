package com.Week5.Assignment.day01;

import java.util.HashSet;

public class Library {

     private static HashSet<Book> bookCollection = new HashSet<Book>();

    public static void main(String[] args) {

        bookCollection.add(null);
        bookCollection.add(null);
        System.out.println(bookCollection);

        Person author1 = new Person("Stephen King", 1947);
        Person author2 = new Person("Mark Twain", 1935);
        Person author3 = new Person("Michelle Obama", 1970);

        Book book1 = new Book("The Shining", author1);
        Book book2 = new Book("Mysterious Stranger", author2);
        Book book3 = new Book("Becoming", author3);

        // IMPORTANT!  hashset is not ordered
        bookCollection.add(book3);
        bookCollection.add(book2);
        bookCollection.add(book1);

        System.out.println(bookCollection);
        bookCollection.add(book2);
        System.out.println(bookCollection);
        bookCollection.remove(book2);
        System.out.println(bookCollection);

        System.out.println(bookCollection.contains(book1));
    }
}
