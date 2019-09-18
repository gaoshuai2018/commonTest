package cn.gs.base.test.jsonTest;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/8/4 11:29
 */
public class JsonTest {

    @Test
    public void jsonStringTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("tenantName", "zs_user");
        map.put("taskId", "aas");
        String string = JSON.toJSONString(map);
        System.out.println(string);
    }
}
