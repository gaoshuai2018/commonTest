package cn.gs.proxyPattern.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 15:29
 */
public class JdkProxyFactory {
    private Object target;

    public JdkProxyFactory(Object object) {
        this.target = object;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务。。。。");
                        Object result = method.invoke(target, args);
                        System.out.println("结束事务。。。。");
                        return result;
                    }
                    //proxy:userDaoImpl
                    //method:saveUser
                    //args:null
                });
    }
}
