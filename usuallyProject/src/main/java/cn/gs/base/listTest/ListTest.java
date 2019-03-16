package cn.gs.base.listTest;

import cn.gs.entity.Person;
import cn.gs.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/12 16:35
 * @Version 1.0
 */
public class ListTest {

    @Test
    public void containsTest() {
        List<String> stringList = new ArrayList<>();
        stringList.add("zhang");
        System.out.println(stringList.contains("zhang"));
    }

    @Test
    public void hashSetTest() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("hello");
        stringSet.add("world");
        stringSet.add("zhangsan");
        stringSet.add("lisi");
//        for (Iterator<String> string = stringSet.iterator(); string.hasNext(); ) {
//            String str = string.next();
//            System.out.println(str);
//        }
        for (String str : stringSet) {
            System.out.println(str);
        }
    }

    @Test
    public void treeSetTest() {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("hello");
        stringSet.add("world");
        stringSet.add("zhangsan");
        stringSet.add("lisi");
        stringSet.add(null);
//        for (Iterator<String> string = stringSet.iterator(); string.hasNext(); ) {
//            String str = string.next();
//            System.out.println(str);
//        }
        for (String str : stringSet) {
            System.out.println(str);
        }
    }

    @Test
    public void treeSetTest2() {
        Set<Person> personSet = new TreeSet<>();
        Person person = new Person();
        person.setPersonId(0L);
        person.setPersonName("zhangsan");
        person.setPersonDesc("zhangsan");

        Person person1 = new Person();
        person1.setPersonId(1L);
        person1.setPersonName("lisi");
        person1.setPersonDesc("lisi");

        Person person2 = new Person();
        person2.setPersonId(2L);
        person2.setPersonName("wangwu");
        person2.setPersonDesc("wangwu");

        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
//        for (Iterator<Person> personIterator = personSet.iterator(); personIterator.hasNext(); ) {
//            Person personTemp = personIterator.next();
//            System.out.println(personTemp);
//        }
        for (Person personTemp : personSet) {
            System.out.println(personTemp);
        }
    }

    @Test
    @Deprecated
    public void collectionsTest() {
        User user = new User();
        user.setUserId(1L);
        user.setUserName("zhangsan");
        user.setUserDesc("zhangsan");
        List<User> userList = new LinkedList<>();
        userList.add(user);

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUserName("lisi");
        user2.setUserDesc("lisi");
        userList.add(user2);
        System.out.println(userList);
//        Collections.sort(userList);

        List<Person> personList = new LinkedList<>();
        Person person = new Person();
        person.setPersonId(0L);
        person.setPersonName("zhangsan");
        person.setPersonDesc("zhangsan");

        Person person1 = new Person();
        person1.setPersonId(1L);
        person1.setPersonName("lisi");
        person1.setPersonDesc("lisi");

        personList.add(person);
        personList.add(person1);
        System.out.println(personList);
        Collections.sort(personList);
    }

    @Test
    public void treeMapTest() {
        TreeMap<Integer, String> tree = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 != null && o2 != null)
                    return o1 - o2;
                else if (o1 == null && o2 != null) {
                    return -1;
                } else if (o1 != null && o2 == null)
                    return 1;
                else
                    return 0;
            }
        });
        tree.put(1, "唐僧");
        tree.put(2, "李白");
        tree.put(5, "白居易");
        tree.put(3, "孙悟空");
        tree.put(2, "李黑");
        tree.put(2, "李黑很好");
        tree.put(null, "赵信");
        System.out.println(tree);
        System.out.println("get(1):" + tree.get(1)
                + "  get(2)" + tree.get(2)
                + "  get(null)" + tree.get(null));
    }

}
