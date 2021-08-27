package abstractfactory.headfirst.pizza;

import abstractfactory.headfirst.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getStyle() + " Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
