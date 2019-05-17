package cn.gs.base.test.OperatorTest;

import org.junit.Test;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/5/17 10:13
 */
public class OperatorTest {

    /**
     * 运算符 | 测试
     */
    //考察知识点：&和&&；|和||
    //
    //             &和&&：
    //
    //     共同点：两者都可做逻辑运算符。它们都表示运算符的两边都是true时，结果为true；
    //
    //     不同点: &也是位运算符。& 表示在运算时两边都会计算，然后再判断；
    //     &&表示先运算符号左边的东西，然后判断是否为true，是true就继续运算右边的然后判断并输出，
    //     是false就停下来直接输出不会再运行后面的东西。
    //
    //             |和||：
    //
    //     共同点：两者都可做逻辑运算符。它们都表示运算符的两边任意一边为true，结果为true，两边都不是true，结果就为false；
    //
    //     不同点：|也是位运算符。| 表示两边都会运算，然后再判断结果；
    //     || 表示先运算符号左边的东西，然后判断是否为true，是true就停下来直接输出不会再运行后面的东西，
    //     是false就继续运算右边的然后判断并输出。
    //
    //     回到本题：
    //
    //             3 | 9=0011（二进制） | 1001（二进制）=1011（二进制）=11（十进制）
    @Test
    public void test1() {
        System.out.println(3 | 9); //11
        System.out.println(3 & 9); //1
    }
}
