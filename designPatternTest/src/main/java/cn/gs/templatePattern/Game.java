package cn.gs.templatePattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/27 15:09
 */
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void playGame() {
        initialize();
        startPlay();
        endPlay();
    }
}
