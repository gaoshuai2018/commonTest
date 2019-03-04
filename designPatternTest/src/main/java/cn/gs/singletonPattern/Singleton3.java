package cn.gs.singletonPattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 17:06
 * 来源： https://www.jianshu.com/p/45885e50d1c4
 */
public class Singleton3 {

    private volatile static Singleton3 SINGLETON3 = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (SINGLETON3 == null) {
            synchronized (Singleton3.class) {
                if (SINGLETON3 == null) {
                    return SINGLETON3;
                }
            }
        }
        return SINGLETON3;
    }
}
