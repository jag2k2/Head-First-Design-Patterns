package factorymethod.pizzastore;

import factorymethod.pizzastore.pizza.ChicagoStyleCheesePizza;
import factorymethod.pizzastore.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else{
            return null;
        }
    }
}
