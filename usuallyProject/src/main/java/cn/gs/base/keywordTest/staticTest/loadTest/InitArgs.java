package cn.gs.base.keywordTest.staticTest.loadTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/4/30 10:50
 */
public class InitArgs {

    private static Map<String, Object> initMap = new HashMap<>();

    static {
        System.out.println("init map");
        initMap.put("a", "a");
        initMap.put("c", "a");
        initMap.put("b", "a");
    }


    public Map<String, Object> getInitMap() {
        return initMap;
    }

}
