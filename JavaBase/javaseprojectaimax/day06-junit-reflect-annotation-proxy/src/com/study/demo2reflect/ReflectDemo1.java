package com.study.demo2reflect;

public class ReflectDemo1 {
    static void main(String[] args) throws ClassNotFoundException {
        // 反射第一步：获取Class对象
        // 1、获取类本身: 类.class
        Class c1 = Student.class;
        System.out.println(c1);
        // 2、获取类本身: Class.forName("全类名")
        Class c2 = Class.forName("com.study.demo2reflect.Student");
        System.out.println(c2);
        // 3、获取类本身: 对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);
    }
}
