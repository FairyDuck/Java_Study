package com.study.demo2recursion;

public class RecursionDemo2 {
    static void main(String[] args) {
        // 计算n的阶乘
        System.out.println(factorial(5));
    }
    // 递归
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
