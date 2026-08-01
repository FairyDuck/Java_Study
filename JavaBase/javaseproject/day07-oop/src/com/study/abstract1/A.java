package com.study.abstract1;

// 抽象类，不能创建对象，仅作为一种特殊的父类，让子类继承
public  abstract class A {
    private String name;
    private int age;

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法，抽象方法没有方法体
    public abstract void show();
}
