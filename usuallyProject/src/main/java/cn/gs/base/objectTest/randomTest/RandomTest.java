package cn.gs.base.objectTest.randomTest;

import org.junit.Test;

import java.util.Random;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/4/28 16:22
 */
public class RandomTest {
    //返回[min,max]范围的随机数
    // 原理:要得到的随机数的范围是[2,100]，假设返回的伪随机数的范围是[0,N)，也即[0,N-1];
    // 对得到的这个数模99，于是计算得到的数的范围是[0,98]；再把结果加2，范围就是[2,100]
    // random.nextInt(20)，任意取[0,20)之间整数，其中0可以取到，20取不到。
    @Test
    public void testRandomRange() {
        int max = 99, min = 10;
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        System.out.println(s);
    }


    @Test
    public void testRandomLength() {
        //随机数长度
        int length = 2;
        StringBuilder res = new StringBuilder();
        Random random = new Random();
        int i = 0;
        while (i < length) {
            res.append(random.nextInt(10));
            i++;
        }
        System.out.println(res);
    }


    @Test
    public void randomSeed() {
        System.out.println("Random不设置种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Random设置种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            random.setSeed(100);
            // 15,  50,  74,  88,  91,  66,  36,  88,  23,  13,
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println();
        }
    }

}
