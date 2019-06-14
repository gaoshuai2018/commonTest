package cn.gs.base.keywordTest.staticTest.loadTest;

/**
 * @description: 静态参数访问
 * @author: gaoshuai
 * @date: 2019/6/6 8:29
 */
@SuppressWarnings("unused")
public class ArgsAccess {

    static {
        num = 2;
        // System.out.println(num); //报错
    }

    private static int num = 1;

    static {
        num = 3;
        System.out.println(num);
    }
}
