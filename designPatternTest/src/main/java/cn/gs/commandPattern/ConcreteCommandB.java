package cn.gs.commandPattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 10:13
 */
public class ConcreteCommandB implements Command {
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doSomething() {
        receiver.doSomethingB();
    }
}
