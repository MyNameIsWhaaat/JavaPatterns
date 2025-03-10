package observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private float exchangeRate;

    public void setExchangeRate(float exchangeRate){
        this.exchangeRate = exchangeRate;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(exchangeRate);
        }
    }

}