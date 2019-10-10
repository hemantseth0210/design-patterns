package com.sethjava.lsp;

public class Rectangle {
    protected int width, height;

    public Rectangle(){

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    // In order to preserve LSP, first solution is that we don't need Square class. We can check width and height.
    // Second solution is to use factory class.
    boolean isSquare(int width, int height){
        return width == height;
    }
}
