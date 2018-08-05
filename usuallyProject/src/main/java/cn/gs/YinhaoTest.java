package cn.gs;

/**
 * @Author: gaoshuai
 * @Date: 2018/7/23 10:17
 * @Version 1.0
 */
public class YinhaoTest {
    public static void main(String[] args) {
        String string = "aaa";
        String[] arr = string.split(",");
        String result = "";
        for (String s : arr) {
            s = "\'" + s + "\',";
            result += s;
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);

    }
}
