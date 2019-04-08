package cn.gs.base.test.cloneTest.deepCopy.demo2;

import java.io.Serializable;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/26 15:32
 * @Version 1.0
 */
public class Professor implements Serializable {

    String name;
    int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
