package com.sethjava.factorymethod.factory;

import com.sethjava.factorymethod.product.*;

public class ChicagoStylePizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String pizzaType) {
        if(pizzaType.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if(pizzaType.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        } else if(pizzaType.equals("clam")){
            return new ChicagoStyleClamPizza();
        } else if(pizzaType.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
