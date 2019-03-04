package cn.gs.observerPattern;

/**
 * @Description:具体观察者
 * @Author: gaoshuai
 * @Date: 2019/2/26 15:22
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void updateMessage(String message) {
        System.out.println("观察者2 收到信息：" + message);
    }
}