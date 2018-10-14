package com.icinfo.design.observer.internetweather.jv;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class CurrentConditions implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(Observable o, Object arg) {
        this.mTemperature = ((WeatherData.Data) arg).mTemperature;
        this.mPressure = ((WeatherData.Data) arg).mPressure;
        this.mHumidity = ((WeatherData.Data) arg).mHumidity;
        display();
    }

    public void display() {
        System.out.println("Today mTemperature:" + mTemperature);
        System.out.println("Today mPressure:" + mPressure);
        System.out.println("Today mHumidity:" + mHumidity);
    }
}
