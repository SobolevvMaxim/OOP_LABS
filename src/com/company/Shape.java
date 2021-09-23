package com.company;

import java.util.Random;

public abstract class Shape {
    private static final Random r = new Random();
    protected final String name;

    public Shape(String name) {
        this.name = name;
    }

    public void printIntersect(Shape shape1) {
        boolean isIntersected = r.nextBoolean();
        if(isIntersected)
            System.out.println(name + " is intersecting " + shape1.name);
        else System.out.println(name + " is not intersecting " + shape1.name);
    }
}
