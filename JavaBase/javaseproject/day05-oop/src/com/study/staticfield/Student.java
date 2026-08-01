package com.study.staticfield;

public class Student {
    // 静态变量（类变量） -属于类，只加载一份，所有对象共享
    static String name;

    // 实例变量（对象变量） -属于对象，每个对象有自己一份
    int age;
}
