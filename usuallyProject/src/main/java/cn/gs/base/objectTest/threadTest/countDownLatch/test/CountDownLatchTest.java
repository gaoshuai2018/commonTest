package cn.gs.base.objectTest.threadTest.countDownLatch.test;

import cn.gs.base.objectTest.threadTest.countDownLatch.WorkThread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: gaoshuai
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        //创建2个点的CountDownLatch对象
        CountDownLatch countDownLatch = new CountDownLatch(2);

        //将countDownLatch对象的引用传递给子线程里
        WorkThread workThread1 = new WorkThread(countDownLatch);
        WorkThread workThread2 = new WorkThread(countDownLatch);
        workThread1.start();
        workThread2.start();

        try {
            //调用await方法阻塞当前线程，等待子线程完成后在继续执行
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("run next process.");
    }

}