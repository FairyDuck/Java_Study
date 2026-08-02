package com.study.demo1exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    static void main(String[] args) {
        // 认识异常的体系，搞清楚异常的基本作用
        show1();
        try {
            // 监视代码，出现异常，会catch处理
            show2();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    // 编译时异常
    public static void show2() throws ParseException {
        String str = "2026-08-01 16:36:52";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员此处程序极容易报错
        System.out.println(date);
    }


    // 运行时异常
    public static void show1() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

        String str = null;
        System.out.println(str);
        System.out.println(str.charAt(0));

        System.out.println("程序结束"); // 异常后不会运行
    }
}
