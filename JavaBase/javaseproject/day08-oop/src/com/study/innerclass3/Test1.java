package com.study.innerclass3;

public class Test1 {
    static void main(String[] args) {
        // 匿名内部类
        // 匿名内部类实际上是有名字的
        // 本质是一个子类，并立即创建出一个子类对象
        Animal animal = new Animal() {
            @Override
            public void cry() {
                System.out.println("叫");
            }
        };
        animal.cry();
    }
}

//class Cat extends Animal {
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}
