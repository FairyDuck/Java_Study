package com.study.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    static void main(String[] args) {
        // 认识set
//        Set<String> set = new HashSet<>(); // 无序、不重复、无索引
        Set<String> set = new LinkedHashSet<>(); // 有序、不重复、无索引
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("java");
        System.out.println(set);

        // treeset
        Set<String> set1 = new TreeSet<>(); // 排序、不重复、无索引
        set1.add("hello");
        set1.add("world");
        set1.add("java");
        set1.add("java");
        System.out.println(set1);
    }
}
