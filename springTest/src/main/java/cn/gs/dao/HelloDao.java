package cn.gs.dao;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/9 17:17
 * @Version 1.0
 */
public class HelloDao {
    public String useName;

    public int userAge;


    public void setUp() {
        System.out.println("初始化！");
    }

    public HelloDao() {
        System.out.println("Hello dao");
    }

    public void destory() {
        System.out.println("销毁了");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("接口初始化！");

    }
}
