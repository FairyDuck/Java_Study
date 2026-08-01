package com.study.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private char sex;
    private double height;

    // 静态方法
    public static int compareAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }

    // 实例方法
    public int compareHeight(Student s1, Student s2) {
        return Double.compare(s1.getHeight(), s2.getHeight());
    }
}
