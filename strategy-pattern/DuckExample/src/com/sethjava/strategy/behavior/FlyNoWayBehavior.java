package com.sethjava.strategy.behavior;

public class FlyNoWayBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
