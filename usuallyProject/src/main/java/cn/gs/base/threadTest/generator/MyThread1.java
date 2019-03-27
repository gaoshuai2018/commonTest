package cn.gs.base.threadTest.generator;

/**
 * @Description: 继承Thread类
 * @Author: gaoshuai
 * @Date: 2019/3/25 11:31
 */
class MyThread1 extends Thread {  //继承Thread

    private int count = 0;

    MyThread1(String name) {
        super(name);
    }

    //复写其中的run方法
    public void run() {
        count++;
        System.out.println(":"+count);
    }


    public static void main(String[] args) {
        MyThread1 d1 = new MyThread1("线程1");
        MyThread1 d2 = new MyThread1("线程2");
        d1.start();
        d2.start();
        System.out.println(d1.count);
    }


}
