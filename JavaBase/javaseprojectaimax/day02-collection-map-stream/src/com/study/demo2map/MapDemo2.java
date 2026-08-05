package com.study.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    static void main(String[] args) {
        // 掌握map集合的方法
        Map<String, String> map = new HashMap<>();
        map.put("001", "张三");
        map.put("002", "李四");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("001"));
        System.out.println(map.containsKey("001"));
        System.out.println(map.containsValue("张三"));
        System.out.println(map.remove("001")); // remove方法返回被删除的元素
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<String> values = map.values();
        System.out.println(values);
        System.out.println(map.getOrDefault("003", "张三"));
    }
}
