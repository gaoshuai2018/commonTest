package cn.gs.base.objectTest.threadTest.deadLock;

public class DeadLockDemo {
    private static final Object resource1 = new Object();//资源 1
    private static final Object resource2 = new Object();//资源 2

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程 1").start();

        ////死锁代码
        // new Thread(() -> {
        //     synchronized (resource2) {
        //         System.out.println(Thread.currentThread() + "get resource2");
        //         try {
        //             Thread.sleep(1000);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //         System.out.println(Thread.currentThread() + "waiting get resource1");
        //         synchronized (resource1) {
        //             System.out.println(Thread.currentThread() + "get resource1");
        //         }
        //     }
        // }, "线程 2").start();

        ////破坏循环等待条件
        // 靠按序申请资源来预防。按某一顺序申请资源，释放资源则反序释放。破坏循环等待条件。
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource2");
                }
            }
        }, "线程 2").start();
    }
}