package cn.gs.annotation.componentScan;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/10 23:08
 */
@MyService("testService")
public class TestService {
    public void sayTest(){
        System.out.println("test");
    }
}
