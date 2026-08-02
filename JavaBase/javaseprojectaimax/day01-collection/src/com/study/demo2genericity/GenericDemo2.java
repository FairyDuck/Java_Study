package com.study.demo2genericity;

public class GenericDemo2 {
    static void main(String[] args) {
        // 自定义泛型类
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("world");
    }
}
