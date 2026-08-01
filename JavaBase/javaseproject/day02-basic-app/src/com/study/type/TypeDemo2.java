package com.study.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 表达式的自动类型提升
        System.out.println(add1(1, 2.0));
    }

    // 接收多种数据类型相加的方法
    public static double add1(int a, double b) {
        return a + b;
    }
}
