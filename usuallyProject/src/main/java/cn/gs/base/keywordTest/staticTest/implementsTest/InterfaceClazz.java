package cn.gs.base.keywordTest.staticTest.implementsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/19 23:00
 */
public interface InterfaceClazz {

    static void sayHello() {
        System.out.println("static world!");
    }

    default void sayDefault() {
        System.out.println("default world!");
    }

    void sayHi();

}
