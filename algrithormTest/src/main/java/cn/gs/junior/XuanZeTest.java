package cn.gs.junior;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/16 15:54
 * @Version 1.0
 */
public class XuanZeTest {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 9, 1, 12, 7};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = i + 1; j < arr.length; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "趟排序：");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
