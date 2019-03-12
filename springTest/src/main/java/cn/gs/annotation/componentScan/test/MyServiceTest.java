package cn.gs.annotation.componentScan.test;

import cn.gs.annotation.componentScan.BeanFactory;
import cn.gs.annotation.componentScan.DemoService;
import cn.gs.annotation.componentScan.TestService;
import org.junit.Test;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/11 9:48
 */
public class MyServiceTest {
    @Test
    public void serviceTest1() throws InstantiationException, IllegalAccessException {
        BeanFactory.init("cn.gs.annotation.componentScan");
        TestService testService = (TestService) BeanFactory.getBean("testService");
        testService.sayTest();

        DemoService demoService = BeanFactory.getBean("demoService", DemoService.class);
        demoService.sayDemo();
    }
}
