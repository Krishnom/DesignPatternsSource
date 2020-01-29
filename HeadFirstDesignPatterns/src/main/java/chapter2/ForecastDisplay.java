package chapter2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float lastPressure;
    private float currentPressure = 29.92f;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        if(lastPressure == currentPressure){
            System.out.println("Feels like same");
        }else if(lastPressure > currentPressure){
            System.out.println("Feels like it will pour. Don't forget to put covers");
        }else{
            System.out.println("Feeling sunny mostly");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.currentPressure = ((WeatherData) o).getPressure();
            display();
        }
    }
}
