package cn.gs.base.keywordTest.extendsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/21 15:43
 */
public class Children extends Parent {
    public void sayChildren() {
        System.out.println("调用父类的方法");
        super.sayParent();
        System.out.println("-------------");
        System.out.println("child class!");
    }
}
