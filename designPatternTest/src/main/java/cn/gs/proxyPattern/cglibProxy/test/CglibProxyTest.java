package cn.gs.proxyPattern.cglibProxy.test;

import cn.gs.proxyPattern.cglibProxy.CglibProxyFactory;
import cn.gs.proxyPattern.cglibProxy.UserDaoImpl;
import org.junit.Test;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 16:13
 * 来源：https://www.cnblogs.com/cenyu/p/6289209.html#autoid-1-0-0
 */
public class CglibProxyTest {
    @Test
    public void cglibProxyTest1() {
        CglibProxyFactory proxyFactory = new CglibProxyFactory(new UserDaoImpl());
        UserDaoImpl instance = (UserDaoImpl) proxyFactory.getInstance();
        instance.saveUser();
    }
}
