package cn.gs.strategyPattern;

/**
 * @Description:具体策略实现2
 * @Author: gaoshuai
 * @Date: 2019/2/26 16:47
 */
public class ConcreteStrategy2 implements IStrategy {
    @Override
    public int getResultNum(int sourceNum) {
        return sourceNum - 2;
    }
}
