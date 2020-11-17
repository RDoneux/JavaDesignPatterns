package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject {
    private final List<Observer> observers;
    private String value;

    public SubjectA() {
        observers = new ArrayList<>();
        value = "Default";
    }

    @Override
    public void register(Observer vehicleObserver) {
        observers.add(vehicleObserver);
    }

    @Override
    public void unregister(Observer vehicleObserver) {
        // This uses the override method
        observers.remove(vehicleObserver);
    }

    public void newValue(String value) {
        this.value = value;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

    @Override
    public String getValue() {
        return value;
    }
}
