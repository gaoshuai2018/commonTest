package cn.gs.base.objectTest.threadTest;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author: gaoshuai
 * @description: ThreadLocal测试
 * @date: 2019/6/3 9:34
 * @source: https://www.cnblogs.com/qilong853/p/5982878.html
 */
// ThreadLocal的本意并不是使其对应的变量达到线程共享的功能，
// 如果要做到线程共享的功能则请使用，Lock获线程同步锁的方式来实现，
// 而ThreadLocal的作用则恰恰则是为了实现线程的不共享，即实现线程所所保留的副本各不冲突的一个作用，
// （可以理解为是为线程提供一个线程私有的变量副本，这样多个线程都可以随意更改自己线程局部的变量，不会影响到其他线程）
// 从而实现并发的另类的一种解决和实现思路
public class ThreadLocalExample implements Runnable {

    // SimpleDateFormat 不是线程安全的，所以每个线程都要有自己独立的副本
    private static final ThreadLocal<SimpleDateFormat> formatter =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(obj, "" + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread Name= " + Thread.currentThread().getName()
                + " default Formatter = " + formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //formatter pattern is changed here by thread, but it won't reflect to other threads
        formatter.set(new SimpleDateFormat());

        System.out.println("Thread Name= " + Thread.currentThread().getName()
                + " formatter = " + formatter.get().toPattern());
    }

}