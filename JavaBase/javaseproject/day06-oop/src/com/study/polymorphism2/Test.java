package com.study.polymorphism2;

// 多态的好处
// 1、右边对象是解耦合的
// 2、父类类型的变量作为参数，可以接收子类对象

// 问题: 不能直接调用子类的方法
public class Test {
    static void main(String[] args) {
        Animal a1 = new Tortoise();
        a1.run();
//        a1.shrinkHead(); // 多态下编译看左边，不能直接使用子类方法

        Wolf w = new Wolf();
        go(w);

        Tortoise t = new Tortoise();
        go(t);
    }

    public static void go(Animal a) {
        System.out.println("开始。。。");
        a.run();
    }
}
