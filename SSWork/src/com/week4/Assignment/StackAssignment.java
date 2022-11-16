package com.week4.Assignment;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackAssignment<T> {

    private LinkedList<T> stackList = new LinkedList<T>();
    private int MAX_CAPACITY = 5;

    public StackAssignment(){
        super();
    }

    public StackAssignment(LinkedList<T> list) {
        super();
        this.stackList = list;
    }

    public void push(T element) {
        if (this.stackList.size() < MAX_CAPACITY) {
            System.out.println(this.stackList.size());
            this.stackList.addLast(element);
        } else {
            System.out.println("This Stack can only holds 5 elements");
        }
    }

    public void pop() {
        try {
            this.stackList.pop();
        } catch (NoSuchElementException nsee){
            System.err.println("Can't pop an element that doesn't exist!");
        }
    }

    public T peek() {
        T element = null;
        if (this.stackList.size() > 0)
            element = stackList.getLast();
        return element;
    }

    public int size(){
        int elements = this.stackList.size();
        return elements;
    }

    public boolean isEmpty(){
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "com.week4.Assignment.StackAssignment{" +
                "stackList=" + stackList +
                '}';
    }
}
