package cn.gs.test.asyncTask;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/5/7 9:27
 */
public class Client {
    public static void main(String[] args) {
        ExecutorDemo demo = new ExecutorDemo();
        demo.asyncTask();
        System.out.println("main end");
    }
}
