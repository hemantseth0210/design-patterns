package com.sethjava.abstractfactory.factory;

import com.sethjava.abstractfactory.factory.ingredient.ChicagoPizzaIngredientFactory;
import com.sethjava.abstractfactory.factory.ingredient.PizzaIngredientFactory;
import com.sethjava.abstractfactory.product.*;


public class ChicagoStylePizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
