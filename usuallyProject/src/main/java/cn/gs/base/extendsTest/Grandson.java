package cn.gs.base.extendsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/21 15:44
 */
public class Grandson extends Children {
    public void sayGrandson() {
        System.out.println(super.name);
        super.sayParent();
    }

    public static void main(String[] args) {
        new Grandson().sayChildren();
    }
}
