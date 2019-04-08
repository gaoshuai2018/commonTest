package cn.gs.base.mathTest;

import org.junit.Test;

/**
 * @Description:
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
