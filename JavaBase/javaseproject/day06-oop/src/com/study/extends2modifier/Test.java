package com.study.extends2modifier;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Fu fu = new Fu();
//        fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
