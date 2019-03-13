package cn.gs.base.threadTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/5 15:37
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread1 =  new Thread();
        Thread thread2 =  new Thread();
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
}
