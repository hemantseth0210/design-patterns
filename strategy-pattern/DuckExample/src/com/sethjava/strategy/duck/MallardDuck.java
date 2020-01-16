package com.sethjava.strategy.duck;

import com.sethjava.strategy.behavior.FlyBehavior;
import com.sethjava.strategy.behavior.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }

}
