package com.study.demo4test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
    static void main(String[] args) {
        // Collections工具类
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5); // 添加数据
        Collections.reverse(list); // 翻转
        System.out.println(list);
        Collections.shuffle(list); // 打乱
    }
}
