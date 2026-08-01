package com.study.method1reference;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    static void main(String[] args) {
        // 特定类型的方法引用
        String[] names = {"Tom", "Jack", "dlei", "Rose", "Andy"};

        // 对数组首字母排序，忽略首字母大小
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2); // 忽视大小写比较
            }
        });

        // 特定类型的方法引用
        // 类型名::方法名
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
