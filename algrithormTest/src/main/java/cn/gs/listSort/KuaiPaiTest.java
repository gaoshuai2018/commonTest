package cn.gs.listSort;

import java.util.Arrays;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/16 15:45
 * @Version 1.0
 */
public class KuaiPaiTest {

    public static void quickSort(int start, int end, int[] arr) {
        if (start >= arr.length - 1 || end <= 0 || start >= end) {
            return;
        }
        int value = arr[start];
        int i = start;
        int j = end;
        while (i != j) {
            for (; j >= 0 && j > i; j--) {
                if (arr[j] <= value) {
                    break;
                }
            }
            for (; i < arr.length && i < j; i++) {
                if (arr[i] > value) {
                    break;
                }
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;

        quickSort(start, i - 1, arr);
        quickSort(i + 1, end, arr);

    }


    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 12, 11};
        System.out.println(Arrays.toString(arr));
        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
