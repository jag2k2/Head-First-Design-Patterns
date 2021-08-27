package observer.headfirst.observers;

import observer.headfirst.WeatherData;

import java.util.Observer;
import java.util.Observable;

public class HeatIndexDisplay implements Observer, DisplayElement{
    private final WeatherData weatherData;
    private float temp = Float.NaN;
    private float humidity = Float.NaN;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        this.temp = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("The heat index is a complicated function of " + temp + " and " + humidity);
    }
}
