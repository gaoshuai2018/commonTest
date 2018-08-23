package cn.gs;

import java.math.BigDecimal;

/**
 * @Author: gaoshuai
 * @Date: 2018/8/15 11:14
 * @Version 1.0
 */
public class DoubleTest {
    public static void main(String[] args) {
        double d1 = 0.6500000000000001;
        BigDecimal b = new BigDecimal(d1);
        double f1 = b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }
}
