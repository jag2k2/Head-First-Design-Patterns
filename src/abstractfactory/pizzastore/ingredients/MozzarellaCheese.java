package abstractfactory.pizzastore.ingredients;

import abstractfactory.pizzastore.pizza.Cheese;

public class MozzarellaCheese implements Cheese {
    @Override
    public String toString() {
        return "Mozzarella Cheese";
    }
}
