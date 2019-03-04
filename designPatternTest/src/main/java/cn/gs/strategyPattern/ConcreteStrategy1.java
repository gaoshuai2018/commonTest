package cn.gs.strategyPattern;

/**
 * @Description:具体策略实现1
 * @Author: gaoshuai
 * @Date: 2019/2/26 16:46
 */
public class ConcreteStrategy1 implements IStrategy {
    @Override
    public int getResultNum(int sourceNum) {
        return sourceNum - 1;
    }
}
