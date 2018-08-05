package cn.gs;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: gaoshuai
 * @Date: 2018/7/18 14:13
 * @Version 1.0
 */
public class DateTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
