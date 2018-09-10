package cn.gs.util;

import org.junit.Test;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/10 17:22
 * @Version 1.0
 */
public class ExceptionUtilTest {
    @Test
    public void getExceptionAllInformationTest() {
        try {
            int a = 0;
            double b = (a * 20 + 1) / a;
            System.out.println(b);
        } catch (Exception e) {
            String exceptionInfo = ExceptionUtil.getExceptionAllInformation(e);
            System.out.println(e.getMessage());
            System.out.println(exceptionInfo);
        }

    }

}