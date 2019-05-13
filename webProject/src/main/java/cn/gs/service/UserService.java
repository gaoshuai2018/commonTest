package cn.gs.service;

import cn.gs.base.entity.User;

import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:04
 * @Version 1.0
 */
public interface UserService {
    /**
     *
     * @param userName 用户名
     * @return 用户
     */
    List<User> getUsersByUserName(String userName);
}
