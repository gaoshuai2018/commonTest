package cn.gs.base.objectTest.collectionsTest.mapTest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: map测试
 * @Author: gaoshuai
 * @Date: 2019/3/28 9:55
 */
public class MapTest {
    @Test
    public void mapPutTest() {
        Map<String, Object> map = new HashMap<>();
        Object firstValue = map.put("abc", 123);
        System.out.println(firstValue);
        Object secondValue = map.put("abc", 456);
        System.out.println(secondValue);
    }
}
