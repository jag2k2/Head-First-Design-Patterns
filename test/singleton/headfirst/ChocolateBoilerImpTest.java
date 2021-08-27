package singleton.headfirst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateBoilerImpTest {

    @Test
    void createsOnlyOneInstance(){
        Boiler boiler = ChocolateBoilerImp.getInstance();
        assertNotNull(boiler);
        Boiler expected = ChocolateBoilerImp.getInstance();
        assertEquals(expected, boiler);
    }

}