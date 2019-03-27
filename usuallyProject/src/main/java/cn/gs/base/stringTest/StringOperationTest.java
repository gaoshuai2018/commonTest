package cn.gs.base.stringTest;

import org.junit.Test;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/27 15:21
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
    public void replaceTest(){
        String string = "abcdefghijklmnopqrstuvwxyza";
        String result = string.replaceAll("abc", "123");
        System.out.println(result);
    }
}
