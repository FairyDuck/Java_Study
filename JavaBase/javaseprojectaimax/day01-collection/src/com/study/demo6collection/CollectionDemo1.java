package com.study.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    static void main(String[] args) {
        // collection集合
        // 1、list集合: 存储有序的、可重复的数据、有索引
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);
        String rs = list.get(0);
        System.out.println(rs);

        // 2、set集合：存储无序的、不可重复的数据
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        System.out.println(set);
    }
}
