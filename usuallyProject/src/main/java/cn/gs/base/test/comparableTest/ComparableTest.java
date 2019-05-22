package cn.gs.base.test.comparableTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/5/20 19:05
 */
public class ComparableTest {
    public static void main(String[] args) {
        Person f1 = new Person("tony", 19);
        Person f2 = new Person("jack", 16);
        Person f3 = new Person("tom", 80);
        Person f4 = new Person("jmson", 44);
        Person f5 = new Person("jason", 44);

        List<Person> list = new ArrayList<>();
        list.add(f1);
        list.add(f3);
        list.add(f4);
        list.add(f2);
        list.add(f5);
        Collections.sort(list);

        for (Person o : list) {
            System.out.println(o.getAge() + "-->" + o.getName());
        }
    }
}
