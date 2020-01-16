package com.sethjava.strategy.behavior;

public class FlyRocketBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly like rocket");
    }
}
