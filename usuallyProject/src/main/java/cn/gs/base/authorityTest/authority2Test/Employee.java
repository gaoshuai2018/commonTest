package cn.gs.base.authorityTest.authority2Test;

import cn.gs.base.authorityTest.authorityTest.User;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/3 18:28
 */
public class Employee {
    public static void main(String[] args) {
        //不同包  不继承类  只能访问public方法
        User user = new User();
        user.userIdPublic = "";
    }
}
