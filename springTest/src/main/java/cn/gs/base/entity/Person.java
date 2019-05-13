package cn.gs.base.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/9 15:06
 * @Version 1.0
 */

@Setter
@Getter
@ToString
public class Person {

    private int personId;
    private String name;
    private boolean sex;
    private float salary;

    public String sayHello() {
        return "hello world!";
    }

}
