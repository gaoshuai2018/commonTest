package cn.gs.adapterPattern.object;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/26 21:08
 */
public class SocketAdapter2 implements ThreeSocketTarget2 {
    TwoSocketAdaptee2 twoSocketAdaptee;

    public SocketAdapter2(TwoSocketAdaptee2 twoSocketAdaptee) {
        this.twoSocketAdaptee = twoSocketAdaptee;
    }

    @Override
    public void three() {
        twoSocketAdaptee.two();
    }
}
