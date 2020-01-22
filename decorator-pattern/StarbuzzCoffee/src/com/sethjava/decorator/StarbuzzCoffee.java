package com.sethjava.decorator;

import com.sethjava.decorator.beverage.Beverage;
import com.sethjava.decorator.beverage.DarkRoast;
import com.sethjava.decorator.beverage.Espresso;
import com.sethjava.decorator.beverage.HouseBlend;
import com.sethjava.decorator.beverage.condiments.Mocha;
import com.sethjava.decorator.beverage.condiments.Soy;
import com.sethjava.decorator.beverage.condiments.SteamedMilk;
import com.sethjava.decorator.beverage.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new SteamedMilk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Whip whippedCoffee = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(whippedCoffee.getDescription() + " $" + whippedCoffee.cost());
    }
}
