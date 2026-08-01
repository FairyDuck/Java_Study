package com.study.method1reference;

import java.util.Arrays;

public class Demo2 {
    static void main(String[] args) {

    }

    public static void test1() {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, '男', 180);
        students[1] = new Student("李四", 19, '女', 170);
        students[2] = new Student("王五", 20, '男', 190);

        // 对学生按年龄升序排序
        Student s = new Student();
        // 实例方法引用，->前后参数列表形式一致
        // 对象名::方法名
        Arrays.sort(students, (o1,o2) -> s.compareHeight(o1, o2));
        Arrays.sort(students, s::compareHeight);
    }
}
