package cn.gs.factoryPattern.factoryMethod;

import cn.gs.factoryPattern.base.Cappuccino;
import cn.gs.factoryPattern.base.Coffee;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 14:56
 */
public class CappuccinoFactory implements CoffeeFactory {
    @Override
    public Coffee createInstance() {
        return new Cappuccino();
    }
}
