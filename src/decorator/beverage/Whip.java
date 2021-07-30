package decorator.beverage;

public class Whip extends AbstractBeverageDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.15f;
    }
}
