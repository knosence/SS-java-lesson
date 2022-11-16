package com.week4.day1.lesson;

// going to mimic the behavior of a singly-linked list
// this T has no relation to the T in our Node class
public class MyLinkedList<T> {

    /*
    What do I need to be a LinkedList?

    1. head node (first node in the list)
    2. can also have a tail node (last node in the list)
    3. node order management
    4. some way to find out the size

     */

    private Node<T> head; // defaults to null

    // could include these or derive them through other means
    // private Node<T> Tail;
    // private int size;

    public MyLinkedList() {
        super();
    }

    public void add(T thing) {
        if (head == null) {
            // this happens if the list is empty
            this.head = new Node<T>(thing);
        } else {
            // create a temporary node to "step" our way through the list
            // need to find out where the end is
            Node<T> LastNodeFinder = this.head;
            while (LastNodeFinder.getNext() != null) {
                LastNodeFinder = LastNodeFinder.getNext();
            }
            Node<T> newNode = new Node<T>(thing);
            LastNodeFinder.setNext(newNode);

        }
    }


}
