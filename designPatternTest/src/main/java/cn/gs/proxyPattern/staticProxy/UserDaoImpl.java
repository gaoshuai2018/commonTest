package cn.gs.proxyPattern.staticProxy;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 15:14
 */
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("保存用户信息。");
    }
}
