package cn.gs.annotation.componentScan;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/10 23:09
 */
public class BeanFactory {
    private static final Map<String, Object> beanContainer = new HashMap<>();

    public static void init(String packageName) throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(MyService.class);
        for (Class<?> aClass : annotated) {
            Object instance = aClass.newInstance();
            MyService annotation = aClass.getAnnotation(MyService.class);
            beanContainer.put(annotation.value(), instance);
        }
    }

    public static Object getBean(String beanName) {
        return beanContainer.get(beanName);
    }

    /**
     * 根据注解名获取指定类型的实例
     *
     * @param beanName bean名称，注解指定的value值
     * @param beanClass bean类型
     * @return 指定类型的实例
     */
    public static <T> T getBean(String beanName, Class<T> beanClass) {
        return beanClass.cast(getBean(beanName));
    }
}
