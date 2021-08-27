package observer.headfirst.observers;

import observer.headfirst.WeatherData;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
