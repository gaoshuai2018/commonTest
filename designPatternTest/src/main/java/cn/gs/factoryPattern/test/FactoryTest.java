package cn.gs.factoryPattern.test;

import cn.gs.factoryPattern.abstractFactory.AbstractFactory;
import cn.gs.factoryPattern.abstractFactory.DefaultFactory;
import cn.gs.factoryPattern.base.Coffee;
import cn.gs.factoryPattern.easyFactory.SimpleFactory;
import cn.gs.factoryPattern.factoryMethod.CappuccinoFactory;
import org.junit.Test;

/**
 * @Description:工厂模式测试类
 * @Author: gaoshuai
 * @Date: 2019/2/28 14:45
 * 来源：https://blog.csdn.net/xiao190128/article/details/80533324
 *      http://www.runoob.com/design-pattern/abstract-factory-pattern.html
 * 简单工厂模式是由一个具体的类去创建其他类的实例，父类是相同的，父类是具体的。
 * 工厂方法模式是有一个抽象的父类定义公共接口，子类负责生成具体的对象，这样做的目的是将类的实例化操作延迟到子类中完成。
 * 抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类。它针对的是有多个产品的等级结构。而工厂方法模式针对的是一个产品的等级结构
 */
public class FactoryTest {
    /**
     * 简单工厂模式
     */
    @Test
    public void easyFactoryTest() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Coffee latte = simpleFactory.createInstance("latte");
        latte.printName();
    }

    /**
     * 工厂方法模式
     */
    @Test
    public void factoryMethodTest() {
        Coffee cappuccino = new CappuccinoFactory().createInstance();
        cappuccino.printName();
    }

    /**
     * 抽象工厂模式
     */
    @Test
    public void abstractFactoryTest() {
        AbstractFactory factory = new DefaultFactory();
        Coffee americano = factory.createAmericanoFactory();
        americano.printName();
    }
}
