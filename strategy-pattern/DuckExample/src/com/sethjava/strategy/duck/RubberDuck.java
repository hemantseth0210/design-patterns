package com.sethjava.strategy.duck;

import com.sethjava.strategy.behavior.FlyBehavior;
import com.sethjava.strategy.behavior.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }


}
