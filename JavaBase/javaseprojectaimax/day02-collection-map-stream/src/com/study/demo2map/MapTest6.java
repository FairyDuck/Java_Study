package com.study.demo2map;

import java.util.*;

public class MapTest6 {
    static void main(String[] args) {
        // Map集合相关案例
        // 共80个学生去A、B、C、D选择，最终选择最多的一个
        calc();
    }

    public static void calc() {
        List<String> location = new ArrayList<>();
        String[] names = {"北京", "天津", "重庆", "上海"};
        Random rd = new Random();
        for(int i = 0;i < 80;i++) {
            location.add(names[rd.nextInt(4)]);
        }

        Map<String, Integer> map = new HashMap<>();
        for(String loc : location) {
            map.put(loc, map.getOrDefault(loc, 0) + 1);
        }
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
