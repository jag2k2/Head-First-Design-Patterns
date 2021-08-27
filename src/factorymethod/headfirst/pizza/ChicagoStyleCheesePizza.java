package factorymethod.headfirst.pizza;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza(){
        super("Chicago Style Deep Dish Pizza", "Extra Thick Crust", "Plum Tomato Sauce");
        super.addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
