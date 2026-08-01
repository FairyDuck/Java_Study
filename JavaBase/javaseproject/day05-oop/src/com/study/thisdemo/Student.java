package com.study.thisdemo;

public class Student {
    // 成员变量
    String name;

    public Student(String name) {
        // this用于消除歧义
        this.name = name; // 后一个name为就近原则得到传参name
    }

    public void print() {
        // this 是一个变量，用在方法中，表示当前对象
        // 哪个对象调用此方法，this就表示哪个对象
        System.out.println(this);
        System.out.println(this.name);
    }
}
