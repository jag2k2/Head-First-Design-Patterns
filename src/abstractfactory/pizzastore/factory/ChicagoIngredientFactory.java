package abstractfactory.pizzastore.factory;

import abstractfactory.pizzastore.PizzaIngredientFactory;
import abstractfactory.pizzastore.ingredients.*;
import abstractfactory.pizzastore.pizza.*;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String getStyle() {
        return "Chicago Style";
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
