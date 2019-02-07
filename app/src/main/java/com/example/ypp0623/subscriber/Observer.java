package com.example.ypp0623.subscriber;

/**
 * Created by 殷朋朋 on 19-2-6.
 */

public interface Observer {
    //当被观察者的数据更新时，将更新的信息当做参数传递给观察者
    void update(float temperature, float humidity, float pressure);
}
