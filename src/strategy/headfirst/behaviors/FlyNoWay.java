package strategy.headfirst.behaviors;

import strategy.headfirst.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly ever!");
    }
}
