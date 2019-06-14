package cn.gs.common;

/**
 * @description: 求一个数字的算术平方根
 * @author: gaoshuai
 * @date: 2019/6/13 17:10
 */
public class NumberSqrt {

   private static double sqrtNumber(double n) {
        double l = 0, r = n;
        double mid = (l + r) / 2;
        while (!doubleEqual(mid * mid, n)) {
            if (mid * mid - n > 1e-5) {
                r = mid;
                mid = (1 + r) / 2;
            } else {
                l = mid;
                mid = (l + r) / 2;
            }
        }
        return mid;
    }

    private static boolean doubleEqual(double a, double b) {
        return a - b < 1e-5 && a - b > -1e-5;
    }

    public static void main(String[] args) {
        double result = sqrtNumber(16);
        double result2 = sqrtNumber(6.25);
        System.out.println(result);
        System.out.println(result2);
    }
}
