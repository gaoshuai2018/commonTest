package cn.gs.aopService;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/10 15:34
 * @Version 1.0
 */

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class Log {

    public void before() {
        System.out.println("方法执行前");
    }
    public void after() {
        System.out.println("方法执行后");
    }
}
