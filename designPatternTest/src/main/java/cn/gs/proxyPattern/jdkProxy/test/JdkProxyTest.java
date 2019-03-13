package cn.gs.proxyPattern.jdkProxy.test;

import cn.gs.proxyPattern.jdkProxy.JdkProxyFactory;
import cn.gs.proxyPattern.jdkProxy.UserDao;
import cn.gs.proxyPattern.jdkProxy.UserDaoImpl;
import org.junit.Test;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 15:33
 * 来源：https://www.cnblogs.com/cenyu/p/6289209.html
 */
public class JdkProxyTest {
    @Test
    public void jdkProxyTest1() {
        UserDao target = new UserDaoImpl();
        JdkProxyFactory proxy = new JdkProxyFactory(target);
        UserDao userDao = (UserDao) proxy.getInstance();
        userDao.saveUser();
    }
}
