package abstractfactory.pizzastore.ingredients;

import abstractfactory.pizzastore.pizza.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public String toString() {
        return "Thin Crust Pizza";
    }
}
