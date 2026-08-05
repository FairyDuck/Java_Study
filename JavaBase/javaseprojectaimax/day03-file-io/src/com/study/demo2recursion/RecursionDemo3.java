package com.study.demo2recursion;

public class RecursionDemo3 {
    static void main(String[] args) {
        // 解决递归题目
        System.out.println(f(1));
    }
    public static int f(int n) {
        if(n == 10) {
            return 1;
        }else {
            return f(n + 1) * 2 + 2;
        }
    }
}
