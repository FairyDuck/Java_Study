package com.study.capsulation;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18); // 设置年龄
        System.out.println(s1.getAge()); // 获取年龄
    }
}
