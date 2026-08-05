package com.study.demo2recursion;

public class RecursionDemo1 {
    static void main(String[] args) {
        // 认识递归
        print(5);
    }
    static void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.println(n);
        }
    }
}
