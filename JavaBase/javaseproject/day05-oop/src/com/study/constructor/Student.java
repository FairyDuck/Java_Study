package com.study.constructor;

public class Student {
    String name;
    int age;
    char sex;

    // 构造器: 特殊方法，创建对象时，会自动调用，名称必须与类名相同
    // 1、无参构造器
    // 注: 类默认带一个无参构造器，如果定义了有参构造器，则无参构造器将不再自动生成
    public Student() {
        System.out.println("无参构造器");
    }

    // 2、有参构造器
    public Student(String name, int age, char sex) {
        System.out.println("有参构造器");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
