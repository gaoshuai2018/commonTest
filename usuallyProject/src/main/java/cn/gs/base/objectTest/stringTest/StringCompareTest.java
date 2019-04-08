package cn.gs.base.objectTest.stringTest;

import org.junit.Test;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/5 14:42
 */
@SuppressWarnings({"StringEquality", "StringOperationCanBeSimplified"})
public class StringCompareTest {
    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        String s3 = s1;
        System.out.println(s3 == s1);//true
        System.out.println(s3 == s2);//true
        s3 = s3 + "d";
        String s4 = "abcd";
        System.out.println(s3.equals(s4));//true
        System.out.println(s3 == s4);//false
        //这里面就是final变量和普通变量的区别了.
        //当final变量是基本数据类型以及String类型时，如果在编译期间能知道它的确切值，则编译器会把它当做编译期常量使用。
        //也就是说在用到该final变量的地方，相当于直接访问的这个常量，不需要在运行时确定。
        //这种和C语言中的宏替换有点像。
        //因此在上面的一段代码中，由于变量被final修饰，因此会被当做编译器常量，
        // 所以在使用到的地方会直接将变量替换为它的值。
        //而对于变量的访问却需要在运行时通过链接来进行。
        //想必其中的区别大家应该明白了.
        //不过要注意，只有在编译期间能确切知道final变量值的情况下.编译器才会进行这样的优化.
        final String s5 = "abc";
        String s6 = s5 + "d";
        System.out.println(s4 == s6);//true
    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
        String s3 = s2;
        s3 += "d";
        String s4 = "abcd";
        System.out.println(s3 == s4);//false
    }
}
