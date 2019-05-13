package cn.gs.controller;

import cn.gs.base.entity.User;
import cn.gs.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsersByUserName")
    public String getUsersByUserName(String userName) {
        List<User> users =  userService.getUsersByUserName(userName);
        return JSON.toJSONString(users);
    }


}
