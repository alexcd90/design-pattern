package com.icinfo.design.observer.internetweather.observer;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
}
