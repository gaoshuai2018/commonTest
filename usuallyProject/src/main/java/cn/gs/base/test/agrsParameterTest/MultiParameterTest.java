package cn.gs.base.test.agrsParameterTest;

/**
 * @description: 多参数传参
 * @author: gaoshuai
 * @date: 2019/5/24 17:05
 */
public class MultiParameterTest {
    private void multiParameter(String param1, Object... params) {
        System.out.println(param1);
        System.out.println(params.length);
    }

    public static void main(String[] args) {
        MultiParameterTest demo = new MultiParameterTest();
        demo.multiParameter("abc", 1, "we", new String[]{"bcd", "a"});
    }

}
