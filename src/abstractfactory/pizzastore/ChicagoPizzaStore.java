package abstractfactory.pizzastore;

import abstractfactory.pizzastore.factory.ChicagoIngredientFactory;
import abstractfactory.pizzastore.pizza.CheesePizza;
import abstractfactory.pizzastore.pizza.Pizza;
import abstractfactory.pizzastore.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        }
        return pizza;
    }
}
