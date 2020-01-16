package com.sethjava.strategy.behavior;

public class LoudQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack loud");
    }
}
