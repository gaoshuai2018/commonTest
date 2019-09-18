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

    @Test
    public void absTest() {
        float a = 1.2345f;
        System.out.println(Math.abs(a));
    }

    @Test
    public void randomTest() {
        double random1 = Math.random();
        System.out.println(random1);
        int length = 3;
        String random = String.format("%." + length + "f", random1);
        System.out.println(random);
        double aDouble = Double.parseDouble(random);
        System.out.println(aDouble);
    }
}
