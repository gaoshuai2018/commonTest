package cn.gs.proxyPattern.staticProxy;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 15:15
 */
public class UserDaoProxy implements UserDao {
    private UserDao target;

    public UserDaoProxy(UserDao target) {
        this.target = target;
    }

    public void saveUser() {
        System.out.println("开始事务。。。。");
        target.saveUser();
        System.out.println("提交事务。。。。");
    }
}
