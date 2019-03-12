package cn.gs.annotation.ownDefinition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/7 15:14
 */
//@Target – 表示该注解用于什么地方。默认值为任何元素，表示该注解用于什么地方。可用的ElementType 参数包括
//  ● ElementType.CONSTRUCTOR: 用于描述构造器
//  ● ElementType.FIELD: 成员变量、对象、属性（包括enum实例）
//  ● ElementType.LOCAL_VARIABLE: 用于描述局部变量
//  ● ElementType.METHOD: 用于描述方法
//  ● ElementType.PACKAGE: 用于描述包
//  ● ElementType.PARAMETER: 用于描述参数
//  ● ElementType.TYPE: 用于描述类、接口(包括注解类型) 或enum声明

//@Retention – 定义该注解的生命周期
//  ●   RetentionPolicy.SOURCE : 在编译阶段丢弃。这些注解在编译结束之后就不再有任何意义，所以它们不会写入字节码。@Override, @SuppressWarnings都属于这类注解。
//  ●   RetentionPolicy.CLASS : 在类加载的时候丢弃。在字节码文件的处理中有用。注解默认使用这种方式
//  ●   RetentionPolicy.RUNTIME : 始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。我们自定义的注解通常使用这种方式。

//@Documented – 一个简单的Annotations 标记注解，表示是否将注解信息添加在java 文档中。
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
