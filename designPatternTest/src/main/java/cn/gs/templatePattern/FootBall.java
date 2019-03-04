package cn.gs.templatePattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/27 15:52
 */
public class FootBall extends Game {
    @Override
    public void initialize() {
        System.out.println("FootBall init");
    }

    @Override
    public void startPlay() {
        System.out.println("FootBall startPlay");
    }

    @Override
    public void endPlay() {
        System.out.println("FootBall endPlay");
    }
}
