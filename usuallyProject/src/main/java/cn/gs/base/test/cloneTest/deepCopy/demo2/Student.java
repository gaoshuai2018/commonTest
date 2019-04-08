package cn.gs.base.test.cloneTest.deepCopy.demo2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/26 15:32
 * @Version 1.0
 */
public class Student implements Serializable {
    String name;
    int age;
    Professor professor;

    public Student(String name, int age, Professor professor) {
        this.name = name;
        this.age = age;
        this.professor = professor;
    }

    public Object deepClone() {
        /*
         *本次实现深克隆使用 ByteArrayOutputStream
         * 和ByteArrayInputStream
         *作为复制过程中字符数组存储中介
         */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            //将bos作为收集字节数组中介
            oos = new ObjectOutputStream(bos);
            //将传入参数student类写入bos中
            oos.writeObject(this);
            //将读取到数据传入ObjectInputStream
            ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            //JDK 1.7后引入 可以同时用| 优化代码可读性
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                if (oos != null) {
                    oos.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", p.name=" + professor.name +
                ", p.age=" + professor.age +
                '}';
    }
}
