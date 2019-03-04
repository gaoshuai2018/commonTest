package cn.gs.singletonPattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 17:02
 */
public class Singleton2 {
    private static Singleton2 SINGLETON2 = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if(SINGLETON2 == null){
            return new Singleton2();
        }
        return SINGLETON2;
    }
}
