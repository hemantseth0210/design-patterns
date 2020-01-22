package com.sethjava.decorator;

public class TransparentShape extends ShapeDecorator {
    private Shape shape;
    private int transparency;

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency";
    }

    @Override
    void addFeature(String feature) {
        System.out.println("Added " + transparency + "% transparency feature");
    }
}
