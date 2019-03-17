package com.icinfo.design.observer.internetweather.observer;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public interface Observer {
    public void update(float mTemperature,float mPressure,float mHumidity);
}
