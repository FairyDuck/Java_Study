package com.study.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo3 {
    static void main(String[] args) {
        // 遍历map集合
        Map<String, String> map = new HashMap<>();
        map.put("001", "张三");
        map.put("002", "李四");
        map.put("003", "王五");
        map.put("004", "赵六");
        map.put("005", "孙七");
        map.put("006", "周八");
        map.put("007", "吴九");
        // 1、放set中遍历
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        // 2、键值对遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "==>" + value);
        }
        // 3、lambda遍历
        map.forEach((key, value) -> System.out.println(key + "==>" + value));
    }
}
