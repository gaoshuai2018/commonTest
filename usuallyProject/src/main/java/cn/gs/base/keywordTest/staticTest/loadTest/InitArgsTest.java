package cn.gs.base.keywordTest.staticTest.loadTest;

import java.util.Map;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/4/30 10:52
 */
public class InitArgsTest {
    public static void main(String[] args) {
        InitArgs initArgs = new InitArgs();
        Map<String, Object> initMap = initArgs.getInitMap();
        System.out.println(initMap);
        InitArgs initArgs1 = new InitArgs();
        Map<String, Object> initMap1 = initArgs1.getInitMap();
        System.out.println(initMap1);
    }
}
