package com.study.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
    static void main(String[] args) {
        // 认识map集合
        // HashMap: 无序、不重复、无索引，键值对都可以为null
        // LinkedHashMap: 有序、不重复、无索引，键值对都可以为null
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("小王", 18);
        map.put("小张", 22);
        map.put("小李", 19);
        map.put("小王", 20); // 覆盖掉旧值
        map.put(null, null);
        System.out.println(map);
    }
}
