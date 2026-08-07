package com.study.demo3annotation;

public class AnnotationDemo2 {
    @MyTest1
    private int age;

    @MyTest1
    public void setAge(int age) {
        this.age = age;
    }
}
