package com.study.demo3annotation;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationDemo4 {
    // 注解的应用场景，模拟Junit框架。有MyTest注解的运行，模拟测试
    static void main(String[] args) {
        // 类对象
        Class c1 = AnnotationDemo4.class;
        // 获取类中所有方法
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            // 如果有MyTest注解
            if(method.isAnnotationPresent(MyTest.class)) {
                // 获取方法上的注解对象
                MyTest annotation = method.getDeclaredAnnotation(MyTest.class);
                // 获取注解的属性值
                int count = annotation.count();
                for (int i = 0; i < count; i++) {
                    try {
                        // 调用方法
                        AnnotationDemo4 demo4 = new AnnotationDemo4();
                        method.invoke(demo4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
    @MyTest(count = 5)
    public void test1() {
        System.out.println("test1");
    }
    public void test2() {
        System.out.println("test2");
    }
    @MyTest
    public void test3() {
        System.out.println("test3");
    }
}
