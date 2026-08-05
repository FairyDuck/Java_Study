package com.study.demo3stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    static void main(String[] args) {
        // 获取stream流
        // 1、获取集合的stream流
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        // 2、map集合的stream流
        Map<String, String> map = new HashMap<>();
        // 获取键流
        Stream<String> s2 = map.keySet().stream();
        // 获取值流
        Stream<String> s3 = map.values().stream();
        // 获取键值对流
        Stream<Map.Entry<String, String>> s4 = map.entrySet().stream();

        // 3、数组的stream流
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> s5 = Arrays.stream(arr);
        Stream<Integer> s6 = Stream.of(arr);
        Stream<Integer> s7 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
