package cn.gs.test.asyncTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 异步任务
 * @author: gaoshuai
 * @date: 2019/5/7 9:24
 */
public class ExecutorDemo {
    private ExecutorService executorService = Executors.newFixedThreadPool(1);

    public void asyncTask() {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    sum += i;
                }
                System.out.println(sum);
                System.out.println("asyncTask end");
                executorService.shutdown();
            }
        });
    }
}
