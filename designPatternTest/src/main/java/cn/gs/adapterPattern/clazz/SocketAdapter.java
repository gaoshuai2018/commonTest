package cn.gs.adapterPattern.clazz;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/26 21:08
 */
public class SocketAdapter extends TwoSocketAdaptee implements ThreeSocketTarget {

    public void three() {
        super.two();
    }
}
