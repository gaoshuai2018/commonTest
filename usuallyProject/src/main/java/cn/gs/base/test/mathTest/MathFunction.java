package cn.gs.base.test.mathTest;

import org.junit.Test;

/**
 * @Description: 平方根测试
 * @Author: gaoshuai
 * @Date: 2019/3/29 10:21
 */
public class MathFunction {
    @Test
    public void sqrtTest() {
        int a = 9;
        double result = Math.sqrt(a);
        int b = 8;
        double resultB = Math.sqrt(b);
        System.out.println(result);
        System.out.println(resultB);
    }
}
