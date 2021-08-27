package strategy.headfirst.behaviors;

import strategy.headfirst.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
