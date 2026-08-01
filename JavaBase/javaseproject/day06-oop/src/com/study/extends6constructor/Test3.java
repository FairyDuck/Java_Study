package com.study.extends6constructor;

public class Test3 {
    static void main(String[] args) {
        // this(...)调用兄弟构造器
        Student s1 = new Student("张三", '男', 18);
        Student s2 = new Student("李四", '男', 20);
    }
}
