package com.study.demo6collection;

import java.util.List;

public class CollectionDemo2 {
    static void main(String[] args) {
        // 认识collection的方法
        List<String> list = List.of("hello", "world", "java");
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.contains("java"));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("world"));
        System.out.println(list.lastIndexOf("java"));
        // toArray
        String[] array = list.toArray(new String[0]);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
