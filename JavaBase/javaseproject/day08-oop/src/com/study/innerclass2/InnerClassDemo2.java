package com.study.innerclass2;

public class InnerClassDemo2 {
    static void main(String[] args) {
        // 静态内部类创建对象
        // 外部类.内部类 静态对象名 = new 外部类.内部类();
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        // 1、静态内部类可以直接访问外部类的静态成员
        // 2、静态内部类不能直接访问外部类的实例成员 --实例成员属于对象，而静态内部类/静态成员属于类
    }
}
