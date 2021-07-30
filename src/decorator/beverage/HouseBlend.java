package decorator.beverage;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public float getCost() {
        return 0.89f;
    }
}
