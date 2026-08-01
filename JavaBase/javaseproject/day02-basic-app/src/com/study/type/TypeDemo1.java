package com.study.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 类型转换
        // 自动类型转换: 小数据类型向大数据类型转换
        byte a = 127;
        print1(a);
        print2(a);

        // 强制类型转换: 大数据类型向小数据类型转换
        int b = 128;
        print3((byte) b); // 强制转换 -可能会丢失精度（溢出）
    }

    // 转换成int
    public static void print1(int a) {
        System.out.println(a);
    }
    // 转换成double
    public static void print2(double a) {
        System.out.println(a);
    }


    // 强制转换
    public static void print3(byte a) {
        System.out.println(a);
    }
}
