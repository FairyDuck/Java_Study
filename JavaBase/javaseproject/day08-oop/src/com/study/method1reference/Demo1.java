package com.study.method1reference;

import java.util.Arrays;

public class Demo1 {
    static void main(String[] args) {

    }

    public static void test1() {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, '男', 180);
        students[1] = new Student("李四", 19, '女', 170);
        students[2] = new Student("王五", 20, '男', 190);

        // 对学生按年龄升序排序
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());


        // 如果lambda表达式只是调用一个静态方法，并且->前后参数形式一致，就可以再次简化成静态方法引用
        Arrays.sort(students, (o1, o2) -> Student.compareAge(o1, o2));
        // 静态方法引用 类名::静态方法名
        Arrays.sort(students, Student::compareAge);
    }
}
