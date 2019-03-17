package com.icinfo.design.observer.internetweather;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class WeatherData {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions mCurrentConditions;

    public WeatherData(CurrentConditions mCurrentConditions) {
        this.mCurrentConditions = mCurrentConditions;
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

    public void dataChange(){
        mCurrentConditions.update(getmTemperature(),getmPressure(),getmHumidity());
    }

    public void setData(float mTemperature,float mPressure,float mHumidity){
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }
}
