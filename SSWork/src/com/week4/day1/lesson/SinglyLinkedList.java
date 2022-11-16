package com.week4.day1.lesson;

public class SinglyLinkedList {
    public static void main(String[] args) {
        // this one goes nowhere and has no value
        Node emptyNode = new Node();

        System.out.println(emptyNode.getValue());
        System.out.println(emptyNode.getNext());

        // this one has a value but still points to nowhere
        Node<String> myFunNode = new Node<String>("Programming is fun");

        System.out.println(myFunNode.getValue());
        System.out.println(myFunNode.getNext());

        Node<String> myOtherNode = new Node<String>("I am Mr. Head!!", myFunNode);

        System.out.println(myFunNode);
        System.out.println(myOtherNode.getNext());
        // can use different data types for each instance of Node, BUT...
        Node<Integer> myNumericallyFunNode = new Node<Integer>(42);

        // ... can Not do this, because requires a Node of String type to be next
        //myFunNode.setNext(myNumericallyFunNode);
    }
}
