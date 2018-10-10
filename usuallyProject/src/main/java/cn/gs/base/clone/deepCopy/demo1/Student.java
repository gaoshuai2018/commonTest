package cn.gs.base.clone.deepCopy.demo1;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/26 10:39
 * @Version 1.0
 */
public class Student implements Cloneable {
    String name;
    int age;
    Professor p;

    public Student(String name, int age, Professor p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    @Override
    public Object clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        try {
            student.p = (Professor) p.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", p.name=" + p.name +
                ", p.age=" + p.age +
                '}';
    }
}
