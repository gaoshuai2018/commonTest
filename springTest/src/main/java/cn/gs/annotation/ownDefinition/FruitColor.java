package cn.gs.annotation.ownDefinition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/7 15:17
 */
@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {

    enum OwnColor {BLUE, RED, GREEN}

    OwnColor fruitColor() default OwnColor.BLUE;
}
