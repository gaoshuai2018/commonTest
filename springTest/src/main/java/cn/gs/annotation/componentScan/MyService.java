package cn.gs.annotation.componentScan;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/10 22:48
 * 来源：https://www.cnblogs.com/jonban/p/annotation.html
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyService {
    String value();
}
