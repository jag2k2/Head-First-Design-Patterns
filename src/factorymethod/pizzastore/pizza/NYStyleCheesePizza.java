package factorymethod.pizzastore.pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        super("NY Style Sauce and Cheese Pizza", "Thin Crust Dough", "Marinara Sauce");
        super.addTopping("Grated Reggiano Cheese");
    }
}
