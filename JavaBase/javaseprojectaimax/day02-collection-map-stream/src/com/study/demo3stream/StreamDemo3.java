package com.study.demo3stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {
    static void main(String[] args) {
        // 学习stream流的中间方法 --支持链式调用
        List<String> list = new ArrayList<>();
        list.add("张一二");
        list.add("张三");
        list.add("张三三");
        list.add("张三三三");

        // 1、过滤
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        // 2、排序方法
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(20);
        list1.add(3);
        // 升序
        list1.stream().sorted().forEach(System.out::println);
        // 降序
        list1.stream().sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
        // 只要前2个
        list1.stream().limit(2).forEach(System.out::println);
        // 跳过前2个
        list1.stream().skip(2).forEach(System.out::println);
        // 去重
        list1.stream().distinct().forEach(System.out::println);
        // 加工方法，每个+10
        list1.stream().map(i -> i + 10).forEach(System.out::println);
    }
}
