package com.sethjava.factorymethod.factory;

import com.sethjava.factorymethod.product.Pizza;

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
