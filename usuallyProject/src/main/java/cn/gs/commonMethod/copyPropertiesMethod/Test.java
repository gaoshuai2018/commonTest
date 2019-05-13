package cn.gs.commonMethod.copyPropertiesMethod;

import org.springframework.beans.BeanUtils;

/**
 * @description: BeanUtils.copyProperties测试
 * @author: gaoshuai
 * @date: 2019/5/6 19:29
 */
public class Test {
    public static void main(String[] args) {
        CopyEntity1 test1 = new CopyEntity1();
        test1.outerName = "hello";
        CopyEntity1.InnerClass innerClass = new CopyEntity1.InnerClass();
        innerClass.InnerName = "world";
        innerClass.testName = "test";
        test1.innerClass = innerClass;
        System.out.println(test1.toString());

        CopyEntity2 test2 = new CopyEntity2();
        BeanUtils.copyProperties(test1, test2);
        test2.innerClass = new CopyEntity2.InnerClass();
        BeanUtils.copyProperties(test1.innerClass, test2.innerClass);

        System.out.println(test2.toString());
    }
}
