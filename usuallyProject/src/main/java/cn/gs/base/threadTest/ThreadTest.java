package cn.gs.base.threadTest;

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

class MyThread1 extends Thread {  //继承Thread

    private int count = 0;

    MyThread1(String name) {
        super(name);
    }

    //复写其中的run方法
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + ",i=" + i);
        }
    }


    public static void main(String[] args) {
        //创建两个线程任务
        MyThread1 d = new MyThread1("线程1");
        MyThread1 d2 = new MyThread1("线程2");

        d.run();//没有开启新线程, 在主线程调用run方法
        d2.start();//开启一个新线程，新线程调用run方法

    }


}
