package com.Week5.Assignment.day01;

import java.util.Objects;

public class Book {
    private String title;
    private Person author;

    public Book(){
        title = "TBD";
        author = new Person("Anonymous", 1970);
    }
    public Book(String title, Person author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return Objects.equals(title, other.title) && Objects.equals(author, other.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                "}\n";
    }
}
