package com.icinfo.design.observer.internetweather.jv;

import com.icinfo.design.observer.internetweather.mode.CurrentConditions;
import com.icinfo.design.observer.internetweather.mode.ForcastCondition;
import com.icinfo.design.observer.internetweather.mode.WeatherDataSt;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class InternetWeather {
    public static void main(String[] args) {
        com.icinfo.design.observer.internetweather.mode.CurrentConditions currentConditions;
        ForcastCondition forcastCondition;
        WeatherDataSt weatherDataSt;

        weatherDataSt=new WeatherDataSt();
        currentConditions=new CurrentConditions();
        forcastCondition=new ForcastCondition();
        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastCondition);
        weatherDataSt.setData(30,150,40);
        weatherDataSt.remove(currentConditions);
        weatherDataSt.setData(34,152,42);

    }
}
