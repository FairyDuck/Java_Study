package com.study.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    static void main(String[] args) {
        // 创建字符串对象，封装数据，调用String的方法处理字符串
        // 以"..."创建的字符串，会存在常量池中，并且同一个字符串只存一次
        // 以new创建的字符串，会创建对象，对象会保存在堆中
        String s1 = "hello world";
        System.out.println(s1);
        System.out.println(s1.length());

        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("hello world");
        System.out.println(s3);

        char[] chars = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};
        String s5 = new String(bytes);
        System.out.println(s5);


        String loginName = "admin";
        System.out.println("请输入账号: ");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.next();
        // == 比较地址，equals比较内容
        if(inputName.equals(loginName)) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        // 字符串截取
        System.out.println("请输入手机号: ");
        String phone = sc.next();
        System.out.println("系统显示的手机号: ");
        System.out.println(phone.substring(0, 3) + "****" + phone.substring(7));
    }
}
