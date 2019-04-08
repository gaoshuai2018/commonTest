package cn.gs.base.keywordTest.staticTest.extendsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/18 17:25
 */
public class ChildrenClazz extends ParentClazz {
    static {
        System.out.println("子类静态代码块");
    }

    public ChildrenClazz() {
        System.out.println("子类构造方法");
    }

    {
        System.out.println("子类代码块");
    }

    public static void main(String[] args) {
        ChildrenClazz childrenClazz = new ChildrenClazz();
        System.out.println(num);
    }
}
