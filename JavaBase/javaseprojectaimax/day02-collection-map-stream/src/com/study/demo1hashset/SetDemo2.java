package com.study.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    static void main(String[] args) {
        // 掌握HashSet去重
        Student s1 = new Student("小王", 18, "北京");
        Student s2 = new Student("小张", 22, "上海");
        Student s3 = new Student("小王", 18, "北京");
        Student s4 = new Student("小张", 22, "上海");

        Set< Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
