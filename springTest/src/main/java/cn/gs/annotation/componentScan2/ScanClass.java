package cn.gs.annotation.componentScan2;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/11 11:21
 */
@MyComponent("scanClass")
public class ScanClass {
    public void sayScan(){
        System.out.println("scan success!");
    }
}
