package com.sethjava.abstractfactory.factory;

import com.sethjava.abstractfactory.product.Pizza;


public abstract class PizzaFactory {

    // other method
    public Pizza orderPizza(String pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // factory method
    public abstract Pizza createPizza(String pizzaType);

    // other methods can go here also
}
