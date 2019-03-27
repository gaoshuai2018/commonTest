package cn.gs.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/22 17:03
 */
// arr:[a,b,a,a]
// arr: a,b,a1,a2
public class ReNameArray {

    public static void main(String[] args) {
        String arr[] = {"a", "b", "a", "a", "c","c","a","b"};
        arr = ReNameArray.resolveArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static String[] resolveArray(String[] arr) {
        Map<String, Integer> arrMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (!arrMap.containsKey(s)) {
                arrMap.put(s, 0);
                continue;
            }
            Integer value = arrMap.get(s);
            arrMap.put(s, ++value);
            arr[i] = s + value;
        }
        return arr;
    }

}
