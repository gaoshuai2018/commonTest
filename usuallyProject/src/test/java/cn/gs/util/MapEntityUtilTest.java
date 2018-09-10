package cn.gs.util;

import cn.gs.entity.Person;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/10 11:27
 * @Version 1.0
 */
public class MapEntityUtilTest {
    @Test
    public void objectToMapTest() {
        Person person = new Person();
        person.setPersonDesc("personDesc");
        person.setPersonId(1L);
        Map<String, Object> map = MapEntityUtil.objectToMap(person);
        System.out.println(map);
    }

    @Test
    public void mapToObjectTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("personId", 1L);
        Person person = (Person) MapEntityUtil.mapToObject(map, Person.class);
        System.out.println(person);
    }
}
