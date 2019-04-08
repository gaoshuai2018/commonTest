package cn.gs.base.test.agrsParameterTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:参数传递
 * @Author: gaoshuai
 * @Date: 2019/3/27 17:50
 */
// java中的参数传递是传值呢？还是传引用？
//
//对象传递是引用值传递，原始类型数据传递是值传递
public class ChuancanTest {


    public void intTest(int number) {
        number = 3;
    }

    @Test
    public void intTest() {
        int number = 1;
        this.intTest(number);
        System.out.println(number);//1
    }


    public void IntegerTest(Integer number) {
        number = 300;
    }

    @Test
    public void IntegerTest() {
        Integer number = 1;
        this.IntegerTest(number);
        System.out.println(number);//1
    }


    public void stringTest(String string) {
        string = "abc";
    }

    @Test
    public void stringTest() {
        String string = "aaa";
        this.stringTest(string);
        System.out.println(string);//aaa
    }


    public void listTest(List<String> strings) {
        strings.add("abc");
    }

    @Test
    public void ListTest() {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        this.listTest(strings);
        System.out.println(strings); //[aaa, abc]
    }


}
