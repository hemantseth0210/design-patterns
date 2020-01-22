package com.sethjava.decorator.beverage.condiments;

import com.sethjava.decorator.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
