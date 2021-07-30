package decorator.beverage;

import org.junit.jupiter.api.*;

class BeverageTest {
    private Beverage beverage;
    private Beverage beverage2;

    @BeforeEach
    void setup(){
        beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        beverage2 = new Espresso();
    }

    @Test
    void getDescription() {
        System.out.println(beverage.getDescription());
        System.out.println(beverage2.getDescription());
    }

    @Test
    void getCost() {
        System.out.println(beverage.getCost());
        System.out.println(beverage2.getCost());
    }
}