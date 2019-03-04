package cn.gs.singletonPattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 17:10
 * 来源：https://www.cnblogs.com/dongyu666/p/6971783.html
 */
public class Singleton4 {
    private Singleton4() {
    }

    private static class SingletonFactory {
        static Singleton4 SINGLETON4 = new Singleton4();
    }

    public Singleton4 getInstance() {
        return SingletonFactory.SINGLETON4;
    }
}
