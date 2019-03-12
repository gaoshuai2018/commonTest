package cn.gs.annotation.componentScan2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/11 11:23
 */
public class MyComponentTest {

    @Test
    public void myComponentTest1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(MyComponent.class);
        applicationContext.refresh();
        ScanClass scanClass = (ScanClass) applicationContext.getBean("scanClass");
        scanClass.sayScan();
    }
}
