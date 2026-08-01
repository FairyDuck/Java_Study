package com.study.singleinstance;

// 单例设计模式（单例类） --饿汉式（提前创建好对象）
// 确保某个类只能创建一个对象
public class A {
    // 1、静态变量，作为本类唯一对象
    private static A a = new A();

    // 2、私有化构造器 --确保创建对象唯一，不允许外部创建对象
    private A() {
    }

    // 3、静态方法，返回唯一对象
    public static A getInstance() {
        return a;
    }
}
