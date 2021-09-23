package com.company;

public class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    @Override
    public void printIntersect(Shape shape1) {
        boolean isIntersected = getBoolean();
        System.out.print("From circle: ");
        if (isIntersected)
            System.out.println(name + " is intersecting " + shape1.name);
        else System.out.println(name + " is not intersecting " + shape1.name);
    }

    @Override
    public String toString() {
        return "Circle{}";
    }
}
