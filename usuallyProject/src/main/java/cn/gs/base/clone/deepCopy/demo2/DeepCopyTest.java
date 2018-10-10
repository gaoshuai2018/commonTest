package cn.gs.base.clone.deepCopy.demo2;

/**
 * @Author: gaoshuai
 * @Date: 2018/9/26 15:37
 * @Version 1.0
 */
public class DeepCopyTest {

    public static void main(String[] args) {
        Professor professor = new Professor("教授1", 40);
        Student student1 = new Student("学生1", 20, professor);
        System.out.println(student1);
        Student student2 = (Student) student1.deepClone();
        student2.name = "学生2";
        student2.age = 19;
        student2.professor.name = "教授2";
        student2.professor.age = 42;
        System.out.println(student1);
    }

}
