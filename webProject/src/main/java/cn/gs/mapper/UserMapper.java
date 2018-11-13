package cn.gs.mapper;

import cn.gs.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/9 13:06
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    List<User> getUsersByUserName(@Param("userName") String userName);
}
