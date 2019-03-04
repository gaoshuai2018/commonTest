package cn.gs.commandPattern;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/2/28 10:14
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void doCommand() {
        command.doSomething();
    }
}
