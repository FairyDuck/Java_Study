package com.study.demo6collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTraversalDemo3 {
    static void main(String[] args) {
        // 掌握collection的遍历方式
        // 1、迭代器遍历
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        // 拿到该集合的迭代器
        Iterator<String> iterator = list.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        // 使用while循环来遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // 问一次拿到一个元素
        }

        // 2、foreach遍历
        for (String s : list) {
            System.out.println(s);
        }
    }
}
