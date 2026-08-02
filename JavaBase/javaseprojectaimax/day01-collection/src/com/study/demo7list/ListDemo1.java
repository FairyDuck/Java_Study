package com.study.demo7list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        // 给第三个位置插入输入
        list.add(2, "java");
        // 删除hello，根据下标删除
        list.remove(0);
        // 修改world为1234
        list.set(0, "1234");
        System.out.println( list);

        for(String s : list) {
            System.out.println(s);
        }
    }
}
