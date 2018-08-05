package cn.gs.aopService;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/10 14:59
 * @Version 1.0
 */
public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法执行");
    }
}
