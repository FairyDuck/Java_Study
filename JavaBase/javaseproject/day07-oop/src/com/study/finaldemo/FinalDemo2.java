package com.study.finaldemo;

public class FinalDemo2 {
    static void main(String[] args) {
        // 常量: 使用static、final修饰的变量
        // 编译后，系统会将所有的常量，统一替换成对应的值，不会影响系统运行效率
        System.out.println(Constant.SYSTEM_NAME);
    }
}
