package cn.gs.proxyPattern.staticProxy.test;

import cn.gs.proxyPattern.staticProxy.UserDao;
import cn.gs.proxyPattern.staticProxy.UserDaoImpl;
import cn.gs.proxyPattern.staticProxy.UserDaoProxy;
import org.junit.Test;

/**
 * @Description:静态代理
 * @Author: gaoshuai
 * @Date: 2019/3/12 15:17
 * 来源： https://www.cnblogs.com/cenyu/p/6289209.html#autoid-1-0-0
 */
public class StaticProxyTest {
    @Test
    public void staticProxyTest1() {
        UserDao target = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.saveUser();
    }
}
