package cn.gs.util;

import org.junit.Test;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/10 11:26
 * @Version 1.0
 */
public class StringUtilTest {
    @Test
    public void camelCaseToUnderscoreNameTest() {
        String result = StringUtil.camelCaseToUnderscoreName("personNameDetail");
        System.out.println(result);
    }

    @Test
    public void underscoreToCamelCaseNameTest() {
        String result = StringUtil.underscoreToCamelCaseName("person_name_detail");
        System.out.println(result);
    }
}
