package observer.observers;

import observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StaticsDisplay implements Observer, DisplayElement{
    private final WeatherData weatherData;
    private float min = Float.NaN;
    private float max = Float.NaN;
    private float sum = 0;
    private int count = 0;

    public StaticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        float temp = weatherData.getTemperature();
        if (count == 0){
            max = temp;
            min = temp;
        }
        else{
            max = Float.max(max, temp);
            min = Float.min(min, temp);
        }
        sum += temp;
        count++;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + sum/count + "/" + max + "/" + min);
    }
}
