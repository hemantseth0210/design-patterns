package com.sethjava.strategy.duck;

import com.sethjava.strategy.behavior.FlyBehavior;
import com.sethjava.strategy.behavior.QuackBehavior;

public class DecoyDuck extends Duck {

    public DecoyDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I am Decoy Duck");
    }

}
