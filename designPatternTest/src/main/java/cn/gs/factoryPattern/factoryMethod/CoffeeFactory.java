package cn.gs.factoryPattern.factoryMethod;

import cn.gs.factoryPattern.base.Coffee;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 14:52
 */
public interface CoffeeFactory {
    Coffee createInstance();
}
