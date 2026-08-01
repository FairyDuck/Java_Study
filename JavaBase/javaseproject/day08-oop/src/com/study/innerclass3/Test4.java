package com.study.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    static void main(String[] args) {
        Student[] studnents = new Student[3];
        studnents[0] = new Student("张三", 18, '男', 180);
        studnents[1] = new Student("李四", 19, '女', 170);
        studnents[2] = new Student("王五", 20, '男', 190);

        // 对学生按年龄升序排序

        Arrays.sort(studnents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 左边-右边，升序
                // 右边-左边，降序
                return o1.getAge() - o2.getAge();
            }
        });

        for (Student student : studnents) {
            System.out.println(student); // lombok重写了toString方法
        }
    }
}
