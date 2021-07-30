package factorymethod.pizzastore;

import org.junit.jupiter.api.Test;
import factorymethod.pizzastore.pizza.*;

class PizzaStoreTest {

    @Test
    void canCreateNYPizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
    }

    @Test
    void canCreateChicagoPizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
    }
}