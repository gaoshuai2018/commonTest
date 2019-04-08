package cn.gs.base.objectTest.listTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/11 16:45
 */
public class ArrayListTest {
    @Test
    public void arrayListTest1() {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(1);
        System.out.println(arrayList);
        LinkedList<Object> objects = new LinkedList<>();
        objects.add("1");
    }
}
