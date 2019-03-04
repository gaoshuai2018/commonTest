package cn.gs.strategyPattern.test;

import cn.gs.strategyPattern.ConcreteStrategy1;
import cn.gs.strategyPattern.ConcreteStrategy2;
import cn.gs.strategyPattern.IStrategy;
import cn.gs.strategyPattern.StrategyContext;
import org.junit.Test;

/**
 * @Description:测试类
 * @Author: gaoshuai
 * @Date: 2019/2/26 16:50
 * 来源：https://www.cnblogs.com/lewis0077/p/5133812.html
 * 现实生活中我们到商场买东西的时候，卖场往往根据不同的客户制定不同的报价策略，
 * 比如针对新客户不打折扣，针对老客户打9折，针对VIP客户打8折...
 */
public class StrategyPatternTest {
    @Test
    public void strategy1Test() {
        int sourceNum = 30;
        IStrategy strategy1 = new ConcreteStrategy1();
        StrategyContext strategyContext = new StrategyContext(strategy1);
        int resultNum1 = strategyContext.getResultNum(sourceNum);
        System.out.println("strategy1 最后结果：" + resultNum1);
    }

    @Test
    public void strategy2Test() {
        int sourceNum = 30;
        IStrategy strategy2 = new ConcreteStrategy2();
        StrategyContext strategyContext = new StrategyContext(strategy2);
        int resultNum1 = strategyContext.getResultNum(sourceNum);
        System.out.println("strategy2 最后结果：" + resultNum1);
    }
}
