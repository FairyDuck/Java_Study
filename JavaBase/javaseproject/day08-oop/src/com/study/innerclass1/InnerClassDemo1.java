package com.study.innerclass1;

public class InnerClassDemo1 {
    static void main(String[] args) {
        // 成员内部类创建对象
        // 外部类.内部类 对象名 = new 外部类().new 内部类();
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
        // 成员内部类访问外部类成员
        // 1、成员内部类中可以直接访问外部类的静态成员，也可以直接访问外部类的实例成员
        // 2、成员内部类的实例方法中，可以直接拿到当前外部类对象
    }
}
