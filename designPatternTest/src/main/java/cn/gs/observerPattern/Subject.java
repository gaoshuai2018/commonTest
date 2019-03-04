package cn.gs.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 主题（被观察者）
 * @Author: gaoshuai
 * @Date: 2019/2/26 15:11
 */
public abstract class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public abstract void notifyAllObserver();
}
