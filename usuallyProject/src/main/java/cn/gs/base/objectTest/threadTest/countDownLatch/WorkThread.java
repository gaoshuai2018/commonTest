package cn.gs.base.objectTest.threadTest.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Gao Shuai
 */
public class WorkThread extends Thread {
    private CountDownLatch countDownLatch;

    public WorkThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + "run start.");
            sleep(3000);
            System.out.println(getName() + "run finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //执行子任务完毕之后，countDown减少一个点
            countDownLatch.countDown();
        }
    }
}