package strategy.headfirst.behaviors;

import strategy.headfirst.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak!");
    }
}
