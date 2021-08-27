package factorymethod.headfirst.pizza;

import java.util.*;

public abstract class Pizza {
    private final String name;
    private final String dough;
    private final String sauce;
    private final List<String> toppings = new ArrayList<>();

    public Pizza(String name, String dough, String sauce){
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    protected void addTopping(String topping){
        toppings.add(topping);
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce:" + sauce);
        System.out.println("Adding toppings:");
        for (String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }
}
