package com.sethjava.strategy.behavior;

public class SingQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can sing");
    }
}
