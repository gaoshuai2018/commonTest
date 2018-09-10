package cn.gs.service;

import cn.gs.entity.User;

import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:04
 * @Version 1.0
 */
public interface UserService {
    /**
     *
     * @param userName
     * @return
     */
    List<User> getUsersByUserName(String userName);
}
