package com.study.demo1exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    static void main(String[] args) {
        // 异常的处理方案
        // 1、底层异常都抛出给最外层调用者，最外层捕获异常，记录异常，返回用户合适信息
        try {
            // 监视代码，出现异常，会catch处理
            show2();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出现异常");
        }
    }

    // 编译时异常
    public static void show2() throws Exception {
        String str = "2026-08-01 16:36:52";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str); // 编译时异常，提醒程序员此处程序极容易报错
        System.out.println(date);
    }
}
