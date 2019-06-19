package cn.gs.service;


import cn.gs.base.entity.User;
import cn.gs.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/6/15 11:12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void getUsersByUserNameTest() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.getUsersByUserName("zhang");
        // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void getTest() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}