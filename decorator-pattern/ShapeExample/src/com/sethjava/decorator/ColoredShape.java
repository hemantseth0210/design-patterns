package com.sethjava.decorator;

public class ColoredShape extends ShapeDecorator{
    private Shape shape;
    private String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color "+ color;
    }

    @Override
    void addFeature(String feature) {
        System.out.println("Added " + color + "color feature");
    }
}
