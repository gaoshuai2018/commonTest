package cn.gs.listSort;

import java.util.Arrays;

/**
 * @Description: 堆排序练习
 * @Author: gaoshuai
 * @Date: 2019/2/18 14:36
 */
public class MyDuiTest {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 6, 9, 7, 8, 0, 12, 11, 13};
        //调整堆
        for (int i = arr.length / 2; i >= 0; i--) {
            heapAdjust(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapAdjust(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void heapAdjust(int[] arr, int parent, int end) {
        int child = parent * 2 + 1;
        int temp = arr[parent];
        while (child < end) {
            //右节点存在
            if (child + 1 < end && arr[child + 1] > arr[child]) {
                child++;
            }
            //最大的子节点比父节点值小  返回
            if (arr[child] < temp) {
                break;
            }

            arr[parent] = arr[child];

            parent = child;
            child = parent * 2 + 1;
        }
        arr[parent] = temp;
    }
}
