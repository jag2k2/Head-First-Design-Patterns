package abstractfactory.headfirst.ingredients;

import abstractfactory.headfirst.pizza.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public String toString() {
        return "Thin Crust Pizza";
    }
}
