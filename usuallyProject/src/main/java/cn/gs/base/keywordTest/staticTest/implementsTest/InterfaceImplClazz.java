package cn.gs.base.keywordTest.staticTest.implementsTest;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/19 23:03
 */
public class InterfaceImplClazz implements InterfaceClazz, Interface2Clazz {

    public static void main(String[] args) {
        InterfaceImplClazz interfaceImplClazz = new InterfaceImplClazz();
        interfaceImplClazz.sayDefault();
    }

    @Override
    public void sayDefault() {
        System.out.println();
    }

    @Override
    public void sayHi() {
        System.out.println("bendi");
    }
}
