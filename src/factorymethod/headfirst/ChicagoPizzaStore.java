package factorymethod.headfirst;

import factorymethod.headfirst.pizza.ChicagoStyleCheesePizza;
import factorymethod.headfirst.pizza.Pizza;

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
