package abstractfactory.pizzastore;

import abstractfactory.pizzastore.pizza.Pizza;
import org.junit.jupiter.api.Test;

class PizzaStoreTest {

    @Test
    void canCreateCheesePizza(){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }

    @Test
    void canCreateVeggiePizza(){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza);

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza);
    }
}