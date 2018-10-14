package com.icinfo.design.observer.internetweather.mode;

import com.icinfo.design.observer.internetweather.observer.Observer;
import com.icinfo.design.observer.internetweather.observer.Subject;

import java.util.ArrayList;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class WeatherDataSt implements Subject {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    private ArrayList<Observer> mObservers;

    public WeatherDataSt() {
        mObservers = new ArrayList<>();
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange() {
        notifyObservers();
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0, len = mObservers.size(); i < len; i++) {
            mObservers.get(i).update(getmTemperature(), getmPressure(), getmHumidity());
        }
    }
}
