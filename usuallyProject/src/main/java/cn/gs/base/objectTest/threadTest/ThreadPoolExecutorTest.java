package cn.gs.base.objectTest.threadTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

    public static void main(String[] args) throws Exception {
        //核心线程数
        int corePoolSize = 5;
        //最大线程数
        int maximumPoolSize = 10;
        //超过 corePoolSize 线程数量的线程最大空闲时间
        long keepAliveTime = 2;
        //以秒为时间单位
        TimeUnit unit = TimeUnit.SECONDS;
        //创建工作队列，用于存放提交的等待执行任务
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        //创建线程池
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(corePoolSize,
                        maximumPoolSize,
                        keepAliveTime,
                        unit,
                        workQueue);

        //循环提交任务
        for (int i = 0; i < 13; i++) {
            //提交任务的索引
            final int index = (i + 1);
            threadPoolExecutor.submit(() -> {
                //线程打印输出
                System.out.println("大家好，我是线程：" + index);
                try {
                    //模拟线程执行时间，10s
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            //每个任务提交后休眠500ms再提交下一个任务，用于保证提交顺序
            Thread.sleep(500);
        }
    }
}