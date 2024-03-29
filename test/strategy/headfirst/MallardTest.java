package strategy.headfirst;

import org.junit.jupiter.api.*;
import strategy.headfirst.behaviors.FlyNoWay;
import strategy.headfirst.behaviors.MuteQuack;


class MallardTest {
    private Duck duck;

    @BeforeEach
    void setup(){
        duck = new Mallard();
    }

    @Test
    void canFly(){
        duck.doFlyBehavior();
    }

    @Test
    void canQuack(){
        duck.doQuackBehavior();
    }

    @Test
    void canSwim(){
        duck.swim();
    }

    @Test
    void canDisplayItself(){
        duck.display();
    }

    @Test
    void canChangeQuackBehavior(){
        duck.doQuackBehavior();
        duck.setQuackBehavior(new MuteQuack());
        duck.doQuackBehavior();
    }

    @Test
    void canChangeFlyBehavior(){
        duck.doFlyBehavior();
        duck.setFlyBehavior(new FlyNoWay());
        duck.doFlyBehavior();
    }
}