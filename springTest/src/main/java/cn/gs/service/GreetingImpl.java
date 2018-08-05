package cn.gs.service;

import org.springframework.stereotype.Component;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/10 10:20
 * @Version 1.0
 */
@Component
public class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("hello bonc!");
    }

    public void goodmorning() {
        System.out.println("good morning!");
    }

    public void goodnight() {
        System.out.println("good night!");
    }
}
