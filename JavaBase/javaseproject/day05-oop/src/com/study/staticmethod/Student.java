package com.study.staticmethod;

// 规范: 如果一个功能不需要访问对象的数据，那么这个功能应该定义为静态方法
//       如果这个方法需要访问对象数据，那么这个功能应该定义为实例方法

// 注: 静态方法中不能出现this关键字
//     静态方法只能访问静态成员属性、静态成员方法
public class Student {
    private double score;

    // 静态方法
    public static void print() {
        System.out.println("静态方法");
    }

    // 实例方法
    public void printPass() {
        System.out.println(score >= 60 ? "通过" : "未通过");
    }

    // getter、setter
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
