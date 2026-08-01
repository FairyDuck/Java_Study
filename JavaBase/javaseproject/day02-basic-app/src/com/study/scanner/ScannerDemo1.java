package com.study.scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerDemo1 {
    static void main(String[] args) {
        // 创建一个扫描器对象
        Scanner sc = new Scanner(System.in);
        // 获取用户输入的整数
        int a = sc.nextInt();
        // 获取用户输入的浮点数
        double b = sc.nextDouble();
        // 获取用户输入的字符
        char c = sc.next().charAt(0);
        // 获取用户输入的字符串
        String d = sc.next();
        // 获取用户输入的布尔值
        boolean e = sc.nextBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        // 随机数生成 -Math.random()生成的随机数范围为[0,1)
        int x = (int)(Math.random() * 10); // *10 变成个位数
        System.out.println(x);

        // 使用Random -数据范围为[0,10)
        Random rd = new Random();
        int y = rd.nextInt(10);
        System.out.println(y);
    }
}
