package com.company;

public class MyStack<T> {
    private final T[] stackArray;
    private final int capacity;
    private int top;

    public MyStack(int capacity) {
        this.capacity = capacity;
        stackArray = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T element) {
        if(isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        stackArray[++top] = element;
    }

    public T pop() {
        if(isEmpty()){
            System.out.println("Underflow!");
            System.exit(1);
        }

        return stackArray[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
}
