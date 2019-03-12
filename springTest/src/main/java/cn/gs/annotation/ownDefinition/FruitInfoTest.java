package cn.gs.annotation.ownDefinition;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/7 15:24
 * 来源：https://www.cnblogs.com/acm-bingzi/p/javaAnnotation.html
 */
public class FruitInfoTest {
    @Test
    public void test() {
        Field[] fields = Apple.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println(fruitName.value());
            }
        }
    }
}
