package com.study.enumdemo;

public class Test {
    static void main(String[] args) {
        A a1 = A.X;
        System.out.println(a1); // 地址（Enum类重写了toString方法，故此返回名字）
        System.out.println(a1.name()); // 名字
        System.out.println(a1.ordinal()); // 索引
    }
}
