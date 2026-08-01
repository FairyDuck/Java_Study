package com.study.enumdemo;

// 枚举类都是最终类，被final修饰；并且是继承java.lang.Enum类
// 枚举类的构造器是私有的，不能创建对象
public enum A {
    // 第一行只能添加枚举值，本质是静态常量
    X, Y, Z;
}
