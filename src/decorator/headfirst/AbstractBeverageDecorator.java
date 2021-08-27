package decorator.headfirst;

public abstract class AbstractBeverageDecorator implements Beverage {
    private final Beverage beverage;

    public AbstractBeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription();
    }

    @Override
    public float getCost(){
        return beverage.getCost();
    }
}
