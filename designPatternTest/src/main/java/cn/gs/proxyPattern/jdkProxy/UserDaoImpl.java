package cn.gs.proxyPattern.jdkProxy;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/12 15:35
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void saveUser() {
        System.out.println("保存用户信息。");
    }
}
