package com.study.demo5genericity;

import java.util.ArrayList;

public class GenericDemo6 {
    static void main(String[] args) {
        // 泛型和集合都不支持基本数据类型，只能支持对象数据类型
        ArrayList<Integer> list = new ArrayList<>();
        // 泛型的擦除：泛型在编译期间会被擦除，只保留类型，所有类型都会被替换成Object

        // 将基本数据类型转换成对象数据类型
        // 手工包装
        Integer i = new Integer(1); // 过时，不推荐
        Integer i1 = Integer.valueOf(1); // 推荐
        Integer i4 = Integer.valueOf(1);
        System.out.println(i1 == i4); // true，因为底层实现了-127~128已经创建好对象了，是直接引用


        // 自动装箱，自动拆箱
        Integer i2 = 1;
        Integer i3 = 2;
        int i5 = i2 + i3;
        System.out.println(i5);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); // 自动装箱，1 是被装成对象装入的


        // 包装类的功能
        // 1、把基本类型的数据栓换成字符串
        int j = 23;
        String s = Integer.toString(j);
        System.out.println(s + 1); // "231"

        Integer i6 = 1;
        String s1 = i6.toString();
        System.out.println(s1 + 1); // "11"

        // 2、把字符串转换成基本数据类型
        String s2 = "23";
        int i7 = Integer.parseInt(s2);
        int i8 = Integer.valueOf(s2);
        System.out.println(i7 + 2); // 25
        String s3 = "23.5";
        double d = Double.parseDouble(s3);
        double d1 = Double.valueOf(s3);
        System.out.println(d + 2);
    }
}
