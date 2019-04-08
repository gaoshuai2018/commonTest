package cn.gs.base.keywordTest.switchTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/21 15:54
 */
public class SwitchTest {
    public int test(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i * 1;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new SwitchTest().test(2);
        System.out.println(i);
    }
}
