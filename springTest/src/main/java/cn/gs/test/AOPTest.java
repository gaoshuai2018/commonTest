package cn.gs.test;

import cn.gs.entity.Person;
import org.junit.Test;
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
        Person person = (Person) ac.getBean("person");
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
