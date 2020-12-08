package observer.observers;

import observer.Subject;

public class StaticsDisplay implements Observer, DisplayElement{
    private final Subject subject;
    private float min = Float.NaN;
    private float max = Float.NaN;
    private float sum = 0;
    private int count = 0;

    public StaticsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
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
