package cn.gs.controller;

import cn.gs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:44
 * @Version 1.0
 */
public class UserController {
    @Autowired
    private UserService userService;

    public String getUsersByUserName(String userName) {
        userService.getUsersByUserName(userName);
        return "";
    }


}
