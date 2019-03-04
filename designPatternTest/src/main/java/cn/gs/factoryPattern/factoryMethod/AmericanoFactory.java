package cn.gs.factoryPattern.factoryMethod;

import cn.gs.factoryPattern.base.Americano;
import cn.gs.factoryPattern.base.Coffee;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 14:57
 */
public class AmericanoFactory implements CoffeeFactory {
    @Override
    public Coffee createInstance() {
        return new Americano();
    }
}
