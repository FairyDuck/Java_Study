package com.study.demo1;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    private static final int arr[] = {};
    static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        while(set.size() < 6) {
            set.add((int)(Math.random() * 35 + 1));
        }
        System.out.println(set);
        int blue = (int)(Math.random() * 15 + 1);
        System.out.println(blue);

        Set<Integer> set1 = new TreeSet<>();
        Collections.addAll(set1,10,12,30,16,7,17);
        int red = 0;
        for(Integer i : set) {
            if(set1.contains(i)) {
                red++;
            }
        }
        System.out.println("红色：" + red);
        System.out.println("蓝色：" + (blue == 12 ? 1 : 0));
    }
}
