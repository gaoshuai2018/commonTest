package cn.gs.singletonPattern;

/**
 * @Description:饿汉单例模式
 * @Author: gaoshuai
 * @Date: 2019/2/28 16:58
 */
public class Singleton1 {

    private static Singleton1 SINGLETON1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return SINGLETON1;
    }

}
