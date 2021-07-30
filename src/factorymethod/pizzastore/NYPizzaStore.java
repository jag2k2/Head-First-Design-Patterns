package factorymethod.pizzastore;

import factorymethod.pizzastore.pizza.NYStyleCheesePizza;
import factorymethod.pizzastore.pizza.Pizza;

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
