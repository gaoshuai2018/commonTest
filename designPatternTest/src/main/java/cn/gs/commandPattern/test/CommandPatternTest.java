package cn.gs.commandPattern.test;

import cn.gs.commandPattern.ConcreteCommandA;
import cn.gs.commandPattern.ConcreteCommandB;
import cn.gs.commandPattern.Invoker;
import cn.gs.commandPattern.Receiver;
import org.junit.Test;

/**
 * @Description:命令模式测试类
 * @Author: gaoshuai
 * @Date: 2019/2/28 10:16
 * 来源：https://www.cnblogs.com/konck/p/4199907.html
 *
 * 命令请求者（Invoker）和命令实现者（Receiver）的解耦
 */
public class CommandPatternTest {
    @Test
    public void commandPatternTest1() {
        Invoker invoker = new Invoker(new ConcreteCommandA(new Receiver()));
        invoker.doCommand();
        System.out.println();
        Invoker invoker2 = new Invoker(new ConcreteCommandB(new Receiver()));
        invoker2.doCommand();
    }
}
