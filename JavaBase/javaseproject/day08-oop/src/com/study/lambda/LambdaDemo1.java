package com.study.lambda;

public class LambdaDemo1 {
    static void main(String[] args) {
        // lambda表达式
        // lambda表达式只能替代函数式接口的匿名内部类
        // (参数列表) -> {方法体}
        // 函数式接口: 有且仅有一个抽象方法的接口
        Animal a1 = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a1.cry();

        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生");
            }
        };
        s1.swimming();

        // lambda表达式简化匿名内部类
        Swim s2 = () -> {
            System.out.println("学生");
        };
        s2.swimming();
    }
}

abstract class Animal{
    public abstract void cry();
}

// 函数式接口: 有且仅有一个抽象方法的接口
@FunctionalInterface // 声明函数式接口
interface Swim{
    void swimming();
}
