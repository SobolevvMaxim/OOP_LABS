package com.company;

import java.util.Random;

public abstract class Shape {
    private static final Random r = new Random();
    protected final String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void printIntersect(Shape shape1);

    protected static boolean getBoolean() {
        return r.nextBoolean();
    }
}
