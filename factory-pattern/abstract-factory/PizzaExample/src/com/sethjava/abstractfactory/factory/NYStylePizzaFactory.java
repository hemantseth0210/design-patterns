package com.sethjava.abstractfactory.factory;

import com.sethjava.abstractfactory.factory.ingredient.NYPizzaIngredientFactory;
import com.sethjava.abstractfactory.factory.ingredient.PizzaIngredientFactory;
import com.sethjava.abstractfactory.product.*;


public class NYStylePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
