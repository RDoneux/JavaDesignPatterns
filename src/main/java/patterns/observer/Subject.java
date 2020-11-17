package patterns.observer;

public interface Subject {
    void register(Observer vehicleObserver);
    void unregister(Observer vehicleObserver);
    void notifyObservers();
    String getValue();
}
