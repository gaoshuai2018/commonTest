package cn.gs.factoryPattern.abstractFactory;

import cn.gs.factoryPattern.base.Americano;
import cn.gs.factoryPattern.base.Cappuccino;
import cn.gs.factoryPattern.base.Latte;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 15:04
 */
public class DefaultFactory implements AbstractFactory {
    @Override
    public Americano createAmericanoFactory() {
        return new Americano();
    }

    @Override
    public Cappuccino createCappuccinoFactory() {
        return new Cappuccino();
    }

    @Override
    public Latte createLatteFactory() {
        return new Latte();
    }
}
