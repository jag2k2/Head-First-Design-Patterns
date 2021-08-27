package decorator.headfirst;

public class Mocha extends AbstractBeverageDecorator {

    public Mocha(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mocha";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.20f;
    }
}
