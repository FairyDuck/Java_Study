package com.study.code;

import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];
    // 静态代码块，用static修饰，类加载时执行
    // 实现对类的静态资源的初始化（初始化放其它部分也可以）
    static {
        schoolName = "上海大学";
        System.out.println("静态代码块");
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
    }

    static void main(String[] args) {
        System.out.println("main方法执行");
        System.out.println(Arrays.toString( cards)); // 直接输出数组内容
    }

}
