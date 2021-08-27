package strategy.headfirst;

import strategy.headfirst.behaviors.FlyWithWings;
import strategy.headfirst.behaviors.Quack;

public class Mallard extends Duck {
    public Mallard() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
