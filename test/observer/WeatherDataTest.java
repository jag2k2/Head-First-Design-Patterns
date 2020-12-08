package observer;

import org.junit.jupiter.api.*;
import observer.observers.*;

class WeatherDataTest {
    private WeatherData weatherData;

    @BeforeEach
    void setup(){
        weatherData = new WeatherData();
    }

    @Test
    void canNotifyMultipleObservers(){
        DisplayElement display1 = new CurrentConditionDisplay(weatherData);
        DisplayElement display2 = new StaticsDisplay(weatherData);
        DisplayElement display3 = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(55, 90, 30.4f);
        weatherData.setMeasurements(50, 85, 29.2f);
        weatherData.setMeasurements(65, 80, 28.5f);
    }

}