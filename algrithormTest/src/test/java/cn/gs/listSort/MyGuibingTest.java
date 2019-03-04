package cn.gs.listSort;

import java.util.Arrays;

/**
 * @Description:归并排序
 * @Author: gaoshuai
 * @Date: 2019/2/19 10:35
 */
public class MyGuibingTest {


    public static void sort(int start, int end, int[] sourceArr) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(start, mid, sourceArr);
        sort(mid + 1, end, sourceArr);
        merge(start, end, sourceArr);
    }

    private static void merge(int start, int end, int[] sourceArr) {
        int[] temp = new int[end - start + 1];
        int t = 0;
        int i = start;
        int mid = (end + start) / 2;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (sourceArr[i] < sourceArr[j]) {
                temp[t++] = sourceArr[j++];
            } else {
                temp[t++] = sourceArr[i++];
            }
        }
        while (i <= mid) {
            temp[t++] = sourceArr[i++];
        }
        while (j <= end) {
            temp[t++] = sourceArr[j++];
        }
        t = 0;
        while (start <= end) {
            sourceArr[start++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 56, 32};
        sort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }
}