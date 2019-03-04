package cn.gs.base.authorityTest.authority2Test;

import cn.gs.base.authorityTest.authorityTest.User;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/3 18:29
 */
public class Employer extends User {

    public static void main(String[] args) {
        //不同包  子类只能访问父类的public和protected方法
        Employer user = new Employer();
        user.userIdPublic = "";
        user.userGenderProtected = "";
    }
}
