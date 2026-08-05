package com.study.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo4 {
    static void main(String[] args) {
        // 学习stream流的终结方法
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher("小王", 18, 1234.2));
        list.add(new Teacher("小张", 22, 5235.4));
        list.add(new Teacher("小李", 19, 6236.3));
        list.add(new Teacher("小胡", 20, 11237.7));

        // 1、过滤只要工资大于5000的
        list.stream().filter(t -> t.getSalary() > 5000).forEach(System.out::println);
        // 2、统计个数
        long count = list.stream().filter(t -> t.getSalary() > 5000).count();
        System.out.println(count);
        // 3、取最值
        Teacher max = list.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary())).get();
        System.out.println(max);
        Teacher min = list.stream().min((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary())).get();
        System.out.println(min);


        List<String> list1 = new ArrayList<>();
        list1.add("张一二");
        list1.add("张三");
        list1.add("张三三");
        list1.add("张三三三");

        // 只能收集一次
        // 收集到集合中
        List<String> list2 = list1.stream().filter(s -> s.startsWith("张")).toList();
        System.out.println(list2);
        // 收集到数组中
        String[] arr = list1.stream().filter(s -> s.startsWith("张")).toArray(String[]::new);
        System.out.println(arr);
        // 收集到set中
        Set<String> set = list1.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());
        System.out.println(set);
        // 收集到map中
        Map<String, String> map = list1.stream().filter(s -> s.startsWith("张")).collect(Collectors.toMap(s -> s, s -> s));
        System.out.println(map);
    }
}
