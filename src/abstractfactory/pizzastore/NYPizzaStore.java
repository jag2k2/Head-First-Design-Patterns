package abstractfactory.pizzastore;

import abstractfactory.pizzastore.factory.NYIngredientFactory;
import abstractfactory.pizzastore.pizza.*;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
