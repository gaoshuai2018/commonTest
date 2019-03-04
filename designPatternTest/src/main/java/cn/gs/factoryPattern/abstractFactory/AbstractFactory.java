package cn.gs.factoryPattern.abstractFactory;

import cn.gs.factoryPattern.base.Americano;
import cn.gs.factoryPattern.base.Cappuccino;
import cn.gs.factoryPattern.base.Latte;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 15:03
 */
public interface AbstractFactory {
    Americano createAmericanoFactory();

    Cappuccino createCappuccinoFactory();

    Latte createLatteFactory();
}
