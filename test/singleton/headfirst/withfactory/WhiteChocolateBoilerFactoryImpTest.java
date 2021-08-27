package singleton.headfirst.withfactory;

import org.junit.jupiter.api.Test;
import singleton.headfirst.Boiler;

import static org.junit.jupiter.api.Assertions.*;

class WhiteChocolateBoilerFactoryImpTest {

    @Test
    void createsOnlyOneInstance(){
        BoilerFactory boilerFactory = new WhiteChocolateBoilerFactoryImp();

        Boiler boiler = boilerFactory.getInstance();
        assertNotNull(boiler);
        Boiler expected = boilerFactory.getInstance();
        assertEquals(expected, boiler);
    }
}