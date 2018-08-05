package cn.gs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;


public class TimeTest {

    public static void main(String[] args) {


        String str = "temp";
        ExecutorService executor = Executors.newCachedThreadPool();

        FutureTask<String> future = new FutureTask<String>(new Callable<String>() {// 使用Callable接口作为构造参数
            public String call() throws Exception {
                // 真正的任务在这里执行，可以为任意类型
                Thread.sleep(100000);
                return "abc";
            }
        });

        executor.execute(future);

        try {
            str = future.get(1000 * 1, TimeUnit.MILLISECONDS); // 取得结果，同时设置超时执行时间默认为2秒。同样可以用future.get()，不设置执行超时时间取得结果
        } catch (Exception e) {
            future.cancel(true);
            System.out.println("chaoshile");

        } finally {
            executor.shutdown();
        }
        System.out.println(str);
    }
}