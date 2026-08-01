package com.study.singleinstance;

// 单例设计模式（单例类）  --懒汉式（延迟创建对象）
public class B {
    private static B b;
    private B() {
    }

    // 调用时如果b为null，则创建对象
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
