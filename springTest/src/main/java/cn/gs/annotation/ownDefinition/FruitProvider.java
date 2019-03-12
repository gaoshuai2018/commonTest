package cn.gs.annotation.ownDefinition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/7 15:20
 */
@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
    int id() default -1;

    String name() default "";

    String address() default "";
}
