package com.company;

public class Run {

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(5);
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("5");
    }
}
