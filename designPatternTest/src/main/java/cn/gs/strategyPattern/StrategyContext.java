package cn.gs.strategyPattern;

/**
 * @Description:策略上下文角色
 * @Author: gaoshuai
 * @Date: 2019/2/26 16:48
 */
public class StrategyContext {
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int getResultNum(int sourceNum) {
        return strategy.getResultNum(sourceNum);
    }
}
