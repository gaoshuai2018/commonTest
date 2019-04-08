package cn.gs.base.objectTest.threadTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/5 15:37
 */
public class ThreadTest extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        int priority = thread1.getPriority();
        int priority2 = thread2.getPriority();
        System.out.println(priority);
        System.out.println(priority2);
        thread1.start();
        thread2.run();
        Thread.State state = thread1.getState();
    }

    public void run() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}

