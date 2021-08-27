package strategy.headfirst.behaviors;

import strategy.headfirst.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings!!");
    }
}
