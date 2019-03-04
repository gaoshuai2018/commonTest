package cn.gs.factoryPattern.easyFactory;

import cn.gs.factoryPattern.base.Americano;
import cn.gs.factoryPattern.base.Cappuccino;
import cn.gs.factoryPattern.base.Coffee;
import cn.gs.factoryPattern.base.Latte;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 14:41
 */
public class SimpleFactory {

    public Coffee createInstance(String type) {
        switch (type) {
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            case "americano":
                return new Americano();
            default:
                return null;
        }
    }
}
