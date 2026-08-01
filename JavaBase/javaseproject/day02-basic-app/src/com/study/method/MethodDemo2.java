package com.study.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 实现方法的重载
        // 方法的重载: 方法名相同，参数列表不同
        print(1);
        print(true);
        print("hello world");
    }

    // 定义一个方法，打印一个整数
    public static void print(int a) {
        System.out.println(a);
    }
    // 重载以上方法，打印一个字符串
    public static void print(String a) {
        System.out.println(a);
    }
    // 重载以上方法，打印一个布尔值
    public static void print(boolean a) {
        System.out.println(a);
    }
}
