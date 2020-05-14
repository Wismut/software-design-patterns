package patterns.behavioral.observer;


import java.util.HashSet;
import java.util.Set;

public class Food implements Observable {
    private boolean isFoodPresent;
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::handleEvent);
        System.out.println();
    }

    public void setFoodPresent(boolean foodPresent) {
        isFoodPresent = foodPresent;
        if (isFoodPresent) {
            notifyObservers();
        }
    }
}
