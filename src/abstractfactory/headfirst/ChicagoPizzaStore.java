package abstractfactory.headfirst;

import abstractfactory.headfirst.factory.ChicagoIngredientFactory;
import abstractfactory.headfirst.pizza.CheesePizza;
import abstractfactory.headfirst.pizza.Pizza;
import abstractfactory.headfirst.pizza.VeggiePizza;

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
