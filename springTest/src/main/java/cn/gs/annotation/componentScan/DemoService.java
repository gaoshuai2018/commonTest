package cn.gs.annotation.componentScan;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/10 23:08
 */
@MyService("demoService")
public class DemoService {
    public void sayDemo(){
        System.out.println("demo");
    }
}
