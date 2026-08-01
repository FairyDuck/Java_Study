package com.study.interface1;

// 注意: 接口不能创建对象
// 接口是用来被类实现（implements）的，一个类可以同时实现多个接口
public interface A {
    // JDK8之前，接口中只能定义常量和抽象方法
    // 1、接口中定义常量，可以省略public、static、final不写
    String SCHOOL_NAME = "黑马";

    // 2、抽象方法，可以省略public、abstract不写
    void run();
    String go();
}
