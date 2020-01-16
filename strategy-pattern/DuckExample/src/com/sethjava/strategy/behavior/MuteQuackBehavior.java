package com.sethjava.strategy.behavior;

public class MuteQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
