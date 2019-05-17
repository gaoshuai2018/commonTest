package cn.gs.base.objectTest.stringTest;

import org.junit.Test;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/3/27 15:21
 */
public class StringOperationTest {
    @Test
    public void indexOfTest() {
        String string = "abcdefghijklmnopqrstuvwxyza";
        System.out.println(string.indexOf("abc")); //0
    }

    @Test
    public void charAtTest() {
        String string = "abcdefghijklmnopqrstuvwxyza";
        System.out.println(string.charAt(0)); //a
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
}
