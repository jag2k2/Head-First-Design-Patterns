package observer.observers;

import observer.*;

public class HeatIndexDisplay implements Observer, DisplayElement{
    private Subject subject;
    private float temp = Float.NaN;
    private float humidity = Float.NaN;

    public HeatIndexDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("The heat index is a complicated function of " + temp + " and " + humidity);
    }
}
