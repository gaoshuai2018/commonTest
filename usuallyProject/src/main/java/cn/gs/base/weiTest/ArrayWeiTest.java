package cn.gs.base.weiTest;

/**
 * @Description:数组中的有N个元素（N为奇数），其中的元素是两两相同，找出不同的那个数
 * @Author: gaoshuai
 * @Date: 2019/3/13 18:13
 */
public class ArrayWeiTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);
    }

}
