package com.study.extends1demo;

public class Test {
    static void main(String[] args) {
        // 创建的子类对象，子类可以集成父类的属性和方法
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSex('男');
        t.setSill("java");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSill());
    }
}
