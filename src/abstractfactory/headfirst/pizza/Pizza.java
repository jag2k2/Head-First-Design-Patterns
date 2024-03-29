package abstractfactory.headfirst.pizza;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    abstract public void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String description = dough + " " + sauce + " " + veggies + " " + cheese;
        return description;
    }
}
