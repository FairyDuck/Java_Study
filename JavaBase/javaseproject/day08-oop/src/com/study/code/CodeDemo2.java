package com.study.code;

public class CodeDemo2 {
    private String name;

    // 实例代码块，每次创建对象时，在构造器前执行
    // 初始化对象的实例资源
     {
         System.out.println("实例代码块");
         name = "张三";
     }

    static void main(String[] args) {
        System.out.println("main方法执行");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
