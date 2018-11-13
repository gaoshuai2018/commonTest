package cn.gs.service;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/10 10:21
 * @Version 1.0
 */
public class GreetingAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("after");
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {

        }
    }

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before");
    }
}
//@Component
//public class GreetingAdvice implements MethodInterceptor {
//
//    public Object invoke(MethodInvocation invocation) throws Throwable {
//        return invocation.proceed();
//    }
//}