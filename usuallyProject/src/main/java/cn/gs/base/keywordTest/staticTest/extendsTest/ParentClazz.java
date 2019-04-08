package cn.gs.base.keywordTest.staticTest.extendsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/18 17:23
 */
public class ParentClazz {
    public static int num;

    static {
        System.out.println("父类静态代码块");
    }

    public ParentClazz() {
        super();
        System.out.println("父类构造方法");
    }

    {
        System.out.println("父类代码块");
    }

}
