package cn.gs.util;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/10 11:20
 * @Version 1.0
 */
public class StringUtil {
    /**
     * 驼峰命名转换为下划线
     *
     * @param camelCaseName 驼峰命名
     * @return 下划线命名
     */
    public static String camelCaseToUnderscoreName(String camelCaseName) {
        StringBuilder result = new StringBuilder();
        if (camelCaseName != null && camelCaseName.length() > 0) {
            result.append(camelCaseName.substring(0, 1).toLowerCase());
            for (int i = 1; i < camelCaseName.length(); i++) {
                char ch = camelCaseName.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result.append("_");
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    /**
     * 下划线命名转换为驼峰
     *
     * @param underscoreName 下划线命名
     * @return 驼峰命名
     */
    public static String underscoreToCamelCaseName(String underscoreName) {
        StringBuilder result = new StringBuilder();
        if (underscoreName != null && underscoreName.length() > 0) {
            boolean flag = false;
            for (int i = 0; i < underscoreName.length(); i++) {
                char ch = underscoreName.charAt(i);
                if ("_".charAt(0) == ch) {
                    flag = true;
                } else {
                    if (flag) {
                        result.append(Character.toUpperCase(ch));
                        flag = false;
                    } else {
                        result.append(ch);
                    }
                }
            }
        }
        return result.toString();
    }


}
