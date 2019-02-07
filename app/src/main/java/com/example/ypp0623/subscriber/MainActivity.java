package com.example.ypp0623.subscriber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WeatherData data = new WeatherData();
        CurrentContionsDisplay display = new CurrentContionsDisplay(data);
        data.setMeasurements(100,100,100);
    }
}
