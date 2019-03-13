package cn.gs.proxyPattern.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 16:09
 */
public class CglibProxyFactory {
    private Object object;

    public CglibProxyFactory(Object object) {
        this.object = object;
    }

    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("开始事务。。。。");
                Object result = method.invoke(object, objects);
                System.out.println("提交事务。。。。");
                return result;
            }
        });
        return enhancer.create();
    }

}
