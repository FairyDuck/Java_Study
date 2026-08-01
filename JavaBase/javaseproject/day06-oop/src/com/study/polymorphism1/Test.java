package com.study.polymorphism1;

public class Test {
    static void main(String[] args) {
        // 多态
        // 1、对象多态，行为多态
        Animal a1 = new Wolf();
        a1.run(); // 方法: 编译看左边，运行看右边
        System.out.println(a1.name); // 成员变量: 编译看左边，运行看左边
        Animal a2 = new Tortoise();
        a2.run(); // 方法: 编译看左边，运行看右边
        System.out.println(a2.name); // 成员变量: 编译看左边，运行看左边
    }
}
