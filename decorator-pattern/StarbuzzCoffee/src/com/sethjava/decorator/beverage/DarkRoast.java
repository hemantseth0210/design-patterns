package com.sethjava.decorator.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.39;
    }
}