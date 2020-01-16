package com.sethjava.strategy.duck;

import com.sethjava.strategy.behavior.FlyBehavior;
import com.sethjava.strategy.behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void quack() {
        quackBehavior.quack();
    }
    public void fly() {
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("I can swim");
    }

    public abstract void display();

    // To change the fly behavior at runtime
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    // To change the quack behavior at runtime
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
