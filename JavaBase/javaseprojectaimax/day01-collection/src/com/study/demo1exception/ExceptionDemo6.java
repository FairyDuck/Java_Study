package com.study.demo1exception;

import java.util.Scanner;

public class ExceptionDemo6 {
    static void main(String[] args) {
        // 异常的处理方法
        // 2、捕获异常对象，尝试重新修复
        System.out.println("程序开始");
        while (true) {
            try {
                double price = userInputPrice();
                break;
            } catch (Exception e) {
                System.out.println("输入价格有误");
            }
        }
    }

    public static double userInputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        return sc.nextDouble();
    }
}
