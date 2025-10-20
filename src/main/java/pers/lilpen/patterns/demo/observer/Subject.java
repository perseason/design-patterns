package pers.lilpen.patterns.demo.observer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : penghuaishun
 * @version : 1.0
 **/
public abstract class Subject {

    private final Map<String, Observer> observers = new ConcurrentHashMap<>();

    public void addObserver(Observer observer) {
        observers.put(String.valueOf(observer.hashCode()), observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(String.valueOf(observer.hashCode()));
    }

    public void notifyObservers() {
        observers.values().forEach(observer -> observer.update(this));
    }
}
