package com.study.innerclass1;

public class Outer {
    // 成员内部类  --内部类相当于是外部类的一部分，所以可以直接访问外部类的private成员
    public class Inner {
        public void show() {
            System.out.println("show");
        }
    }
}
