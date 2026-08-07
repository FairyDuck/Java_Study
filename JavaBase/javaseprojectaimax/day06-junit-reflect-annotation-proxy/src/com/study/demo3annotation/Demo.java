package com.study.demo3annotation;

@MyTest2(value = "类",address = "北京")
public class Demo {
    @MyTest2(value = "方法",address = "北京")
    public void show() {
        System.out.println("show方法");
    }
}
