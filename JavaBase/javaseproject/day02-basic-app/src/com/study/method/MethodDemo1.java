package com.study.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 方法的定义和调用
        System.out.println(add(1, 2));
        print();
    }

    // 定义一个方法实现两个整数求和
    public static int add(int a, int b) {
        return a + b;
    }

    // 打印三行Hello World，无需参数及返回值
    public static void print() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
}
