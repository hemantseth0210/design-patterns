package com.sethjava.abstractfactory;

import com.sethjava.abstractfactory.factory.ChicagoStylePizzaFactory;
import com.sethjava.abstractfactory.factory.NYStylePizzaFactory;
import com.sethjava.abstractfactory.factory.PizzaFactory;
import com.sethjava.abstractfactory.product.Pizza;

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
