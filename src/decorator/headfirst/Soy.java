package decorator.headfirst;

public class Soy extends AbstractBeverageDecorator{

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.25f;
    }
}
