package com.sethjava.strategy.behavior;

public class FlyWithWingsBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with wings");
    }
}
