package com.study.demo;

import java.util.Scanner;

public class AllTest {
    static void main(String[] args) {
        // 健康计算器
        Scanner sc = new Scanner(System.in);
        // 用户输入: 身高、体重、 性别、年龄
        System.out.println("请输入身高：");
        double height = sc.nextDouble();

        System.out.println("请输入体重：");
        double weight = sc.nextDouble();

        System.out.println("请输入性别：");
        String sex = sc.next();

        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        // 计算BMI、BMR并输出
        System.out.println("BMI：" + BMI(height, weight));
        System.out.println("BMR：" + BMR(height, weight, sex, age));
    }

    // BMI 计算
    public static double BMI(double height, double weight) {
        return weight / (height * height);
    }

    // BMR 计算
    public static double BMR(double height, double weight, String sex, int age) {
        return (10 * weight + 6.25 * height - 5 * age + 5) * (sex.equals("男") ? 1 : -1);
    }
}
