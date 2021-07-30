package abstractfactory.pizzastore;

import abstractfactory.pizzastore.pizza.*;

public interface PizzaIngredientFactory {
    String getStyle();
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
