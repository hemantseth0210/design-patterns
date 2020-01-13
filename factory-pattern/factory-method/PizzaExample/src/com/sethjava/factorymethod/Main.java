package com.sethjava.factorymethod;

import com.sethjava.factorymethod.factory.ChicagoStylePizzaFactory;
import com.sethjava.factorymethod.factory.NYStylePizzaFactory;
import com.sethjava.factorymethod.factory.PizzaFactory;
import com.sethjava.factorymethod.product.Pizza;

public class Main {

    public static void main(String[] args) {
        PizzaFactory nyPizzaFactory = new NYStylePizzaFactory();
        Pizza pizza = nyPizzaFactory.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName());

        System.out.println("#####################################");

        PizzaFactory chicagoPizzaFactory = new ChicagoStylePizzaFactory();
        pizza = chicagoPizzaFactory.orderPizza("cheese");
        System.out.println("Joel order a " + pizza.getName());
    }
}
