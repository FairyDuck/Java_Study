package com.study.demo4genericity;

public class GenericDemo4 {
    static void main(String[] args) {
        // 学习泛型方法
        show(1);
        show("hello");
        show(true);
    }

    public static <T> void show(T t) {
        System.out.println(t);
    }
}
