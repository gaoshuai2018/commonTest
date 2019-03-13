package cn.gs.base.intergerTest;

import org.junit.Test;

/**
 * int,Integer比较
 */
//https://blog.csdn.net/chenliguan/article/details/53888018
//（1）Integer是int的包装类；int是基本数据类型；
//（2）Integer变量必须实例化后才能使用；int变量不需要；
//（3）Integer实际是对象的引用，指向此new的Integer对象；int是直接存储数据值 ；
//（4）Integer的默认值是null；int的默认值是0。
public class IntegerCompareTest {
    //Integer变量实际上是对一个Integer对象的引用，
    // 所以两个new Integer()永远是不相等的(因为new生成的是两个对象，其内存地址不同)
    @Test
    public void twoNewIntegerTest() {
        Integer t1 = new Integer(1);
        Integer t2 = new Integer(1);
        System.out.println(t1.equals(t2)); //true
        System.out.println(t2 == t1); //false
    }

    //Integer变量和int变量比较时，只要两个变量的值是向等的，则结果为true
    // 因为包装类Integer和基本数据类型int比较时，
    // java会自动拆包装为int，然后进行比较，实际上就变为两个int变量的比较
    @Test
    public void intNewIntegerTest() {
        int t1 = 1;
        Integer t2 = new Integer(1);
        System.out.println(t2.equals(t1)); //true
        System.out.println(t1 == t2); //true
    }

    //非new生成的Integer变量和new Integer()生成的变量比较时，结果为false。
    //（因为非new生成的Integer变量指向的是java常量池中的对象，
    // 而new Integer()生成的变量指向堆中新建的对象，两者在内存中的地址不同）
    @Test
    public void integerNewIntegerTest() {
        Integer t1 = 1;
        Integer t2 = new Integer(1);
        System.out.println(t2.equals(t1)); //true
        System.out.println(t1 == t2); //false
    }

    //对于两个非new生成的Integer对象，进行比较时，
    // 如果两个变量的值在区间-128到127之间，则比较结果为true，
    // 如果两个变量的值不在此区间，则比较结果为false
    @Test
    public void integerIntegerTest() {
        Integer t1 = 1;
        Integer t2 = 1;
        System.out.println(t1 == t2); //true

        Integer t3 = 1024;
        Integer t4 = 1024;
        System.out.println(t3 == t4); //false
    }
}

