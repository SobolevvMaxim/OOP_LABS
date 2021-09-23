package com.company;

public class Square extends Shape{

    public Square(String name) {
        super(name);
    }

    @Override
    public void printIntersect(Shape shape1) {
        boolean isIntersected = getBoolean();
        System.out.print("From square: ");
        if (isIntersected)
            System.out.println(name + " is intersecting " + shape1.name);
        else System.out.println(name + " is not intersecting " + shape1.name);
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
