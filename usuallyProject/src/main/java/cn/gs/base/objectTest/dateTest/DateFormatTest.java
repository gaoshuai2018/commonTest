package cn.gs.base.objectTest.dateTest;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/6/3 9:34
 */
public class DateFormatTest {
    @Test
    public void defaultFormatTest() {
        SimpleDateFormat sdf = new SimpleDateFormat();//yy-M-d ah:mm
        Date date = new Date();
        String dateString = sdf.format(date);
        System.out.println(dateString); //19-7-15 下午6:22
    }
}
