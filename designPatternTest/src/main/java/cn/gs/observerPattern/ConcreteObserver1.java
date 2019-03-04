package cn.gs.observerPattern;

/**
 * @Description:具体观察者
 * @Author: gaoshuai
 * @Date: 2019/2/26 15:21
 */
public class ConcreteObserver1 implements Observer {
    public void updateMessage(String message) {
        System.out.println("观察者1 收到信息：" + message);
    }
}
