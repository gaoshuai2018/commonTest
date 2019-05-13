package cn.gs.base.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/9 15:08
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person person = (Person)context.getBean("person");
//        System.out.println(person.toString());
//        System.out.println(person.sayHello());

//        PersonService personService = (PersonService) context.getBean("personService");
//        String personInfos = personService.selectPersonInfo();
//        System.out.println(personInfos);
//        System.out.println(personService);
//        personService = (PersonService) context.getBean("personService");
//        System.out.println(personService);


    }
}
