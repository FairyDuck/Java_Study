package com.study.extends3modifier;

import com.study.extends2modifier.Fu;

public class Demo {
    public static void main(String[] args) {
        // 创建对象
        Fu fu = new Fu();
//        fu.privateMethod();
//        fu.defaultMethod();
//        fu.protectedMethod();
        fu.publicMethod();
    }
}
