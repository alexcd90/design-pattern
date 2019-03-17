package com.icinfo.design.observer.internetweather.jv;

import java.util.Observable;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class WeatherData extends Observable{
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setData(float mTemperature,float mPressure,float mHumidity){
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        dataChange();
    }

    public void dataChange() {
        this.setChanged();
        this.notifyObservers(new Data(getmTemperature(),getmPressure(),getmHumidity()));
    }

    public class Data{
        public float mTemperature;
        public float mPressure;
        public float mHumidity;

        public Data(float mTemperature, float mPressure, float mHumidity) {
            this.mTemperature = mTemperature;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }
}
