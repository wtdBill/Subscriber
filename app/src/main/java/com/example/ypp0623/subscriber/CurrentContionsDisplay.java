package com.example.ypp0623.subscriber;

import android.util.Log;

/**
 * Created by 殷朋朋 on 19-2-7.
 */
//观察者实现观察者接口和具体的数据展示
public class CurrentContionsDisplay implements Observer, DisplayElement {
    private static final String TAG = "CurrentContionsDisplay";
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentContionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        Log.d(TAG, "display: " + temperature + "::" + humidity);
    }
}
