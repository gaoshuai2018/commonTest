package cn.gs.aopService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/10 14:58
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加用户");
    }

    public void update(int a) {
        System.out.println("修改用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void search() {
        System.out.println("查询用户");
    }
}
