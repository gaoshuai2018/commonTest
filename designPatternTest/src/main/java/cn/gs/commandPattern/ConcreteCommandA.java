package cn.gs.commandPattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 10:09
 */
public class ConcreteCommandA implements Command {
    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doSomething() {
        receiver.doSomethingA();
    }
}
