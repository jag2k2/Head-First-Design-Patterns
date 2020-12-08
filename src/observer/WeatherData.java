package observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature = Float.NaN;
    private float humidity = Float.NaN;
    private float pressure = Float.NaN;

    public WeatherData(){ }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
