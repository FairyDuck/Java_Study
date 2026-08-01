package com.study.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    static void main(String[] args) {
        // 认识掌握ArrayList
        // 创建
        ArrayList<String> list = new ArrayList<>();

        // 添加
        list.add("张三");
        list.add("李四");
        System.out.println(list);

        // 获取
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // 移除
        list.remove(0);
        System.out.println(list);

        // 替换
        list.set(0, "王五");
        System.out.println(list);
    }
}
