package cn.gs.test;

import cn.gs.aopService.UserService;
import cn.gs.service.Greeting;
import cn.gs.service.GreetingAdvice;
import cn.gs.service.GreetingImpl;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/10 10:23
 * @Version 1.0
 */
public class AOPTest {
    @Test
    public void test() {
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setTarget(new GreetingImpl());
//        proxyFactory.addAdvice(new GreetingAdvice());
//        Greeting greeting = (GreetingImpl)proxyFactory.getProxy();
//        String result = greeting.sayHello("zhangsan");
//        System.out.println(result);
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService)ac.getBean("userService");
//        userService.update(2);
//        userService.add();


        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Greeting greeting = (Greeting)ac.getBean("greetingProxy");
//        greeting.sayHello("zhangsan");
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
