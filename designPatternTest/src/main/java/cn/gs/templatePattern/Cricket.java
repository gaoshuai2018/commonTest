package cn.gs.templatePattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/27 15:51
 */
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket init");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket startPlay");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket endPlay");
    }
}
