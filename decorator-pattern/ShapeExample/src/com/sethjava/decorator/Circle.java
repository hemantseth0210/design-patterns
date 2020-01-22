package com.sethjava.decorator;

public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "A Circle of radius "+ radius;
    }
}
