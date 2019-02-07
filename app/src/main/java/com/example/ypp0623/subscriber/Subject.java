package com.example.ypp0623.subscriber;


/**
 * Created by 殷朋朋 on 19-2-6.
 */

public interface Subject {
    void registerObserver(Observer o); //注册观察者
    void removeObserver(Observer o); //删除观察者
    void notifyObservers(); //当被观察者状态改变时，通知所有观察者信息
}
