package cn.gs.base.objectTest.stringTest;

import cn.gs.base.entity.Person;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/3/27 15:21
 */
public class StringOperationTest {
    @Test
    public void indexOfTest() {
        String string = "abcdefghijklmnopqrstuvwxyza";
        //返回0
        System.out.println(string.indexOf("abc"));
    }

    @Test
    public void charAtTest() {
        String string = "abcdefghijklmnopqrstuvwxyza";
        //返回a
        System.out.println(string.charAt(0));
    }

    @Test
    public void replaceTest() {
        String string = "abcdefghijklmnopqrstuvwxyza";
        String result = string.replaceAll("abc", "123");
        System.out.println(result);
    }

    @Test
    public void replace2Test() {
        String string = "$1$||$2$";
        String result = string.replace("$1$", "123");
        System.out.println(result);
    }

    @Test
    public void subStringTest() {
        String string = "zhangsan";
        string = string.substring(1, 2);
        System.out.println(string);
    }

    @Test
    public void stringToList() {
        String string = "{\"mainTables\":[{\"personId\":1,\"personName\":\"zhangsan\"}]}";
        Map<String, Object> stringMap = JSON.parseObject(string, new TypeReference<HashMap<String, Object>>() {
        });
        List<Person> personList = JSONArray.parseArray(String.valueOf(stringMap.get("mainTables")),
                Person.class);
        if (personList == null || personList.size() < 1) {
            System.out.println("size = 0");
            return;
        }
        for (Person person : personList) {
            String value = String.valueOf(person.getPersonDesc());
            System.out.println(value.endsWith("ll"));
        }
    }

    @Test
    public void stringNullTest() {
        String string = null;
        if (("hello").equals(string)) {
            System.out.println("hello");
        } else {
            System.out.println("null");
        }
    }

}
