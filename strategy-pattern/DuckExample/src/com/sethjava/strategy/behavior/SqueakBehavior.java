package com.sethjava.strategy.behavior;

public class SqueakBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can squeak");
    }
}
