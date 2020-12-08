package strategy;

import strategy.behaviors.FlyWithWings;
import strategy.behaviors.Quack;

public class Mallard extends Duck {
    public Mallard() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
