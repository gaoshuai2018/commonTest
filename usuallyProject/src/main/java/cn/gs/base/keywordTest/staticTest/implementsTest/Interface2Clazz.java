package cn.gs.base.keywordTest.staticTest.implementsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/19 23:27
 */
public interface Interface2Clazz {
    default void sayDefault() {
        System.out.println("default world2!");
    }

    void sayHi();
}
