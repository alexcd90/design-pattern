package com.icinfo.design.observer.internetweather;

/**
 * 描述:  <br>
 * <p>
 * author jkk
 * date 2018年10月02
 */
public class InternetWeather {
    public static void main(String[] args) {
        WeatherData weatherData;
        CurrentConditions currentConditions;
        currentConditions = new CurrentConditions();
        weatherData = new WeatherData(currentConditions);
        weatherData.setData(-20,150,40);

    }
}
