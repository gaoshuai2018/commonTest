package cn.gs.base;

import org.junit.Test;
import sun.misc.BASE64Decoder;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: gaoshuai
 * @Date: 2018/8/26 18:18
 * @Version 1.0
 */
public class CommonTest {
    @Test
    public void shortTest() {
        short a = (short) 1;
        a = (short) (a + 1);
        System.out.println(a);
    }

    @Test
    public void charTest() {
        char ch = '点';
        System.out.println(ch);
    }

    @Test
    public void yidongTest() {
        int a = 160;
        int b = a >> 2;
        System.out.println(b);
    }

    @Test
    public void changduTest() {
        String str = "sss";
        System.out.println(str.length());
        String[] strings = new String[]{"22", "22"};
        System.out.println(strings.length);
        List<String> stringList = new LinkedList<>();
        stringList.add("abc");
        System.out.println(stringList.size());
        String string = "文件下载";
        System.out.println(string.length());
    }

    @Test
    public void doubleTest() {
        double d1 = 0.6500000000000001;
        BigDecimal b = new BigDecimal(d1);
        double f1 = b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
    }

    @Test
    public void yinhaoTest() {
        String string = "aaa";
        String[] arr = string.split(",");
        StringBuilder resultBuilder = new StringBuilder();
        for (String s : arr) {
            s = "\'" + s + "\',";
            resultBuilder.append(s);
        }
        String result = resultBuilder.toString();
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }

    @Test
    public void collectionsTest() {
        List emptyList = Collections.EMPTY_LIST;
        List<Object> objects = Collections.emptyList();
        System.out.println(emptyList.size());
        System.out.println(objects.size());
    }

    @Test
    public void base64Test() {
        String value = "eyJ2YWx1ZSI6Im9vb29vIiwiaGVpZ2h0IjoiODAwcHgiLCJ0UHJvamVjdElkIjoiMzhjYzQzNDBiNWVlNGVlY2E3OGU4NzZjYTI3OGJjY2EiLCJ0b3RhbE1vbmV5IjoiOS4zMCIsInRvdGFsTnVtYmVyIjo0LCJNb250aFRvdGFsIjozLCJtb25leSI6IjQuNjUiLCJwZXJNb25leSI6IjMuMTAiLCJ0ZWFtTSI6IjEuNTUiLCJhbGxtb25leSI6IjYuMjAiLCJ3b3JrbG9hZCI6IjEyLjAwIn0=";
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            System.out.println(new String(decoder.decodeBuffer(value), StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void numberFormatTest() {
        int num = 1;

        Format f1 = new DecimalFormat("000");
        System.out.println(f1.format(num));

        Format f2 = new DecimalFormat("00");
        System.out.println(f2.format(num));
    }

    /**
     * 实现字符串多个空格转换一个空格
     */
    @Test
    public void multiSpacesToSpaceTest() {
        String string = "ab  dd ss   ff     sss  ";
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(string);
        String resultString = matcher.replaceAll(" ");
        System.out.println(resultString);

    }

    /**
     * 位运算
     */
    @Test
    public void weiTest() {
        int a = 2 << 3;
        System.out.println(a);
    }


    @Test
    public void forListTest() {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("f");

//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println("list size= " + stringList.size());
//            System.out.println(stringList.get(i));
//            if ("c".equals(stringList.get(i)))
//                stringList.remove(stringList.get(i));
//        }

        for (String s : stringList) {
            System.out.println(s);
            if ("c".equals(s)) {
                stringList.remove(s);
            }
        }

    }

}
