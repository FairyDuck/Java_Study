package com.study.demo3stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    static void main(String[] args) {
        // 认识stream流
        List<String> list = new ArrayList<>();
        list.add("张一二");
        list.add("张三");
        list.add("张三三");
        list.add("张三三三");

        // 需求：将list集合中，姓张的且名字为三个字元素，存储到一个新的集合中
        // 普通方法
        List<String> list1 = new ArrayList<>();
        for(String s : list) {
            if(s.startsWith("张") && s.length() == 3) {
                list1.add(s);
            }
        }
        // stream流方法
        List<String> list2 = list.stream().filter(s -> s.startsWith("张") && s.length() == 3).toList();
    }
}
