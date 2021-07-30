package abstractfactory.pizzastore.factory;

import abstractfactory.pizzastore.PizzaIngredientFactory;
import abstractfactory.pizzastore.ingredients.*;
import abstractfactory.pizzastore.pizza.*;

public class NYIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String getStyle() {
        return "NY Style";
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
