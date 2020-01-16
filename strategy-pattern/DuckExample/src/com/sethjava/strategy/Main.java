package com.sethjava.strategy;

import com.sethjava.strategy.behavior.*;
import com.sethjava.strategy.duck.*;

public class Main {

    public static void main(String[] args) {
	    Duck duck1 = new MallardDuck(new LoudQuackBehavior(), new FlyWithWingsBehavior());
	    duck1.display();
	    duck1.quack();
	    duck1.swim();
	    duck1.fly();
	    duck1.setFlyBehavior(new FlyRocketBehavior());
        duck1.fly();

        System.out.println("#######################");

        Duck duck2 = new RedheadDuck(new SqueakBehavior(), new FlyWithWingsBehavior());
        duck2.display();
        duck2.quack();
        duck2.swim();
        duck2.fly();
        duck2.setQuackBehavior(new SingQuackBehavior());
        duck2.quack();

        System.out.println("#######################");

        Duck duck3 = new RubberDuck(new MuteQuackBehavior(), new FlyNoWayBehavior());
        duck3.display();
        duck3.quack();
        duck3.swim();
        duck3.fly();

        System.out.println("#######################");

        Duck duck4 = new DecoyDuck(new SqueakBehavior(), new FlyNoWayBehavior());
        duck4.display();
        duck4.quack();
        duck4.swim();
        duck4.fly();
    }
}
