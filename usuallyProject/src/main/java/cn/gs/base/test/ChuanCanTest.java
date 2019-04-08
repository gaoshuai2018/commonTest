package cn.gs.base.test;

/**
 * @Author: gaoshuai
 * @Date: 2018/8/24 17:06
 * @Version 1.0
 */

//https://blog.csdn.net/Norte_L/article/details/80250057
// 基本数据类型传值，对形参的修改不会影响实参；
// 引用类型传引用，形参和实参指向同一个内存地址（同一个对象），所以对参数的修改会影响到实际的对象。
// String, Integer, Double等immutable的类型特殊处理，可以理解为传值，最后的操作不会修改实参对象。
public class ChuanCanTest {

    public void intAdd(int i) {
        i += 1;
    }

    public void integerAdd(Integer i) {
        i += 1;
    }

    private void arrayAdd(int[] arr) {
        arr[1] = 1;
    }

    public static void main(String[] args) {
        ChuanCanTest test = new ChuanCanTest();
        int a = 1;
        test.intAdd(a);
        System.out.println(a);


        Integer b = 1;
        test.integerAdd(b);
        System.out.println(b);

        int[] arr = new int[4];
        arr[0] = 1;
        System.out.println(arr[1]);
        test.arrayAdd(arr);
        System.out.println(arr[1]);
    }
}
