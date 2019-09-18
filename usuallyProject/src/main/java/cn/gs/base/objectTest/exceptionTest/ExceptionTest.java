package cn.gs.base.objectTest.exceptionTest;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @description: 异常测试
 * @author: gaoshuai
 * @date: 2019/7/16 15:58
 */
public class ExceptionTest {


    @Test
    public void getExceptionAllInformation() {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            e.printStackTrace(printStream);
            String ret = new String(outputStream.toByteArray());
            printStream.close();
            try {
                outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println(ret);
        }
    }
}
