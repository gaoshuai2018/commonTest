package cn.gs.base.threadTest;

import lombok.Data;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/4/3 17:34
 */
@Data
public class SellTicket implements Runnable {
    private int num;//票数量
    private boolean flag = true;//若为false则售票停止

    public SellTicket(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (flag) {
            ticketSell();
        }
    }

    private synchronized void ticketSell() {
        if (num <= 0) {
            flag = false;
            return;
        }
        try {
            Thread.sleep(20);//模拟延时操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //输出当前窗口号以及出票序列号
        System.out.println(Thread.currentThread().getName() + "售出票序列号：" + num--);
    }


    public static void main(String[] args) {
        SellTicket ticket = new SellTicket(100);
        Thread window01 = new Thread(ticket, "窗口01");
        Thread window02 = new Thread(ticket, "窗口02");
        Thread window03 = new Thread(ticket, "窗口03");
        window01.start();
        window02.start();
        window03.start();
    }
}
