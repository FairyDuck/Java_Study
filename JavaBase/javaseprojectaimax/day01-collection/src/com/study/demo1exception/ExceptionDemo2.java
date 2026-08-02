package com.study.demo1exception;

public class ExceptionDemo2 {
    static void main(String[] args) {
        // 认识异常的作用
        div(10, 0);
    }

    // 两个数相除
    public static int div(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return a / b;
    }
}
