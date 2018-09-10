package cn.gs.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/10 17:21
 * @Version 1.0
 */
public class ExceptionUtil {
    /**
     * 返回异常详细信息
     * @param ex
     * @return
     */
    public static String getExceptionAllInformation(Exception ex) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream pout = new PrintStream(out);
        ex.printStackTrace(pout);
        String ret = new String(out.toByteArray());
        pout.close();
        try {
            out.close();
        } catch (Exception e) {
        }
        return ret;
    }
}
