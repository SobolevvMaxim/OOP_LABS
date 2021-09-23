package com.company;

public class Run {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        Square square = new Square("Square");
        circle.printIntersect(square);
        square.printIntersect(circle);
    }
}