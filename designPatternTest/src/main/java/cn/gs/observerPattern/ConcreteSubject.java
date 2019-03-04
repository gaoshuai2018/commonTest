package cn.gs.observerPattern;

/**
 * @Description: 具体目标
 * @Author: gaoshuai
 * @Date: 2019/2/26 15:17
 */
public class ConcreteSubject extends Subject {
    private String message;

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.updateMessage(this.getMessage());
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.notifyAllObserver();
    }
}
