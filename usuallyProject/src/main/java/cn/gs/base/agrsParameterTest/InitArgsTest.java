package cn.gs.base.agrsParameterTest;

import java.util.Arrays;

/**
 * @Description:args传参
 * @Author: gaoshuai
 * @Date: 2019/3/17 13:03
 */
//program arguments:name=zhangsan age=40
public class InitArgsTest {
    public static void main(String[] args) {

        System.out.println(args.length);
        // 2
        System.out.println(Arrays.toString(args));
        // [name=zhangsan, age=40]
    }
}
