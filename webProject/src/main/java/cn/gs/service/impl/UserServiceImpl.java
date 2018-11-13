package cn.gs.service.impl;

import cn.gs.entity.User;
import cn.gs.mapper.UserMapper;
import cn.gs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:05
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsersByUserName(String userName) {
        if (null == userName || "".equals(userName)) {
            return null;
        }
        return userMapper.getUsersByUserName(userName);
    }

}
