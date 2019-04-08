package cn.gs.common;

import java.util.HashMap;

/**
 * @Description:找出数据中两数之和为某数的数组下标
 * @Author: gaoshuai
 * @Date: 2019/4/2 14:28
 */
public class NumberSum {


    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 8, 6, 1, 8, 9, 7};
        int sum = 14;
        String indexes = getNumberSumIndex(sum, arr);
        System.out.println(indexes);
    }

    private static String getNumberSumIndex(int sum, int[] arr) {
        String indexes = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return i + " " + map.get(arr[i]);
            }
            map.put(sum - arr[i], i);
        }
        return indexes;

    }


}
