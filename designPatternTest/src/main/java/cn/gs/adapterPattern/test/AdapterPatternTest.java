package cn.gs.adapterPattern.test;

import cn.gs.adapterPattern.clazz.SocketAdapter;
import cn.gs.adapterPattern.object.SocketAdapter2;
import cn.gs.adapterPattern.object.TwoSocketAdaptee2;
import org.junit.Test;

/**
 * @Description:适配器
 * @Author: gaoshuai
 * @Date: 2019/2/26 21:12
 * 来源：https://www.cnblogs.com/songyaqi/p/4805820.html
 */
public class AdapterPatternTest {
    /**
     * 对象适配器模式
     */
    @Test
    public void adapterPatternTest1() {
        SocketAdapter socketAdapter = new SocketAdapter();
        socketAdapter.three();
    }

    /**
     * 类适配器模式
     */
    @Test
    public void adapterPatternTest2() {
        SocketAdapter2 socketAdapter2 = new SocketAdapter2(new TwoSocketAdaptee2());
        socketAdapter2.three();
    }

}
