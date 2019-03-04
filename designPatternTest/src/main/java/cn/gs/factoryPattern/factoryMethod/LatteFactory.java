package cn.gs.factoryPattern.factoryMethod;

import cn.gs.factoryPattern.base.Coffee;
import cn.gs.factoryPattern.base.Latte;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 14:54
 */
public class LatteFactory implements CoffeeFactory {
    @Override
    public Coffee createInstance() {
        return new Latte();
    }
}
