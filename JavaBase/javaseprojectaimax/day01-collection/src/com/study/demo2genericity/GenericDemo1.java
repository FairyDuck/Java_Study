package com.study.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    static void main(String[] args) {
        // 学习泛型
        // 没用泛型，可以添加任何数据
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("hello");
        list.add(true);

        // 泛型
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
    }
}
