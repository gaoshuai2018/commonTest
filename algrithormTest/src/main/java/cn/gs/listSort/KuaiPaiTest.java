package cn.gs.listSort;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/16 15:45
 * @Version 1.0
 */
public class KuaiPaiTest {

    int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

    void quickSort(int start, int end) {
        if (start >= 9 || end <= 0 || start >= end) {
            return;
        }
        int value = arr[start];
        int j = end;
        int i = start;
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

        quickSort(start, i - 1);
        quickSort(i + 1, end);

    }


    public static void main(String[] args) {
        KuaiPaiTest kuaiPaiTest = new KuaiPaiTest();
        int arr[] = kuaiPaiTest.arr;
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        kuaiPaiTest.quickSort(0, 9);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
