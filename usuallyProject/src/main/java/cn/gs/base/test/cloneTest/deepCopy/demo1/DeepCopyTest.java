package cn.gs.base.test.cloneTest.deepCopy.demo1;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/26 10:43
 * @Version 1.0
 */
public class DeepCopyTest {
    public static void main(String[] args) {
        Professor professor = new Professor("王五", 40);
        Student student1 = new Student("学生1", 20, professor);
        System.out.println(student1.toString());
        Student student2 = (Student) student1.clone();
        student2.name = "学生2";
        student2.age = 19;
        student2.p.name = "教授2";
        student2.p.age = 42;
        System.out.println(student1.toString());
    }
}
