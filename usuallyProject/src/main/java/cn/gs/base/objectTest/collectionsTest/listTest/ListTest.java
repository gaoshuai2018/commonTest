package cn.gs.base.objectTest.collectionsTest.listTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description: List测试
 * @Author: gaoshuai
 * @Date: 2019/3/11 16:45
 */
public class ListTest {
    @Test
    public void arrayListTest1() {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(1);
        System.out.println(arrayList);
        LinkedList<Object> objects = new LinkedList<>();
        objects.add("1");
    }
}
