package cn.gs.mapper;

import cn.gs.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:06
 * @Version 1.0
 */
public interface UserMapper {

    /**
     * @param userName
     * @return
     */
    List<User> getUsersByUserName(@Param("userName") String userName);
}
