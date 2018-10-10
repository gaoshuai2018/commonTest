package cn.gs.base.clone.deepCopy.demo1;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/26 10:37
 * @Version 1.0
 */
//https://www.cnblogs.com/xuanxufeng/p/6558330.html
public class Professor implements Cloneable {
    String name;
    int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

