package cn.gs.observerPattern.test;

import cn.gs.observerPattern.ConcreteObserver1;
import cn.gs.observerPattern.ConcreteObserver2;
import cn.gs.observerPattern.ConcreteSubject;

/**
 * @Description:测试类
 * @Author: gaoshuai
 * @Date: 2019/2/26 15:22
 * 来源 https://www.cnblogs.com/renhui/p/6479748.html
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.setMessage("公众号更新hello world");
    }
}
