package cn.gs.base.keywordTest.breakTest;

import org.junit.Test;

/**
 * @description: break测试
 * @author: gaoshuai
 * @date: 2019/5/28 14:40
 */
public class BreakTest {
    /*
        break 结束当前循环
     */
    @Test
    public void breakTest1() {
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (j == 5) {
                    break;
                }
            }
            num = i;
        }
        System.out.println(num); //100
    }
}
