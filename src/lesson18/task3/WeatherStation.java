package lesson18.task3;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: observers){
            observer.update(temperature);
        }
    }

    public void setTemperature(int newTemperature){
        this.temperature = newTemperature;
        notifyObservers();
    }
}
