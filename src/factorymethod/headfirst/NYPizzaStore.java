package factorymethod.headfirst;

import factorymethod.headfirst.pizza.NYStyleCheesePizza;
import factorymethod.headfirst.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        else{
            return null;
        }

    }
}