package abstractfactory.pizzastore.ingredients;

import abstractfactory.pizzastore.pizza.Dough;

public class ThickCrustDough implements Dough {
    @Override
    public String toString() {
        return "Thick Crust Dough";
    }
}
