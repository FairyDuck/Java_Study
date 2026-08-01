package com.study.polymorphism3;

// 多态的好处
// 1、右边对象是解耦合的
// 2、父类类型的变量作为参数，可以接收子类对象

// 问题: 不能直接调用子类的方法
public class Test {
    static void main(String[] args) {
        Animal a1 = new Tortoise();
        a1.run();
//        a1.shrinkHead(); // 多态下编译看左边，不能直接使用子类方法
        // 强制类型转换来调用子类方法，编译阶段不报错，运行时可能报错类型转换异常
        Tortoise t0 = (Tortoise) a1;
        t0.shrinkHead();

        if(a1 instanceof Tortoise) {
            Tortoise t1 = (Tortoise) a1;
            t1.shrinkHead();
        }

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
