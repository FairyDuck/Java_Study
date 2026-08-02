package com.study.demo1exception;

public class ExceptionDemo3 {
    static void main(String[] args) {
        // 认识自定义异常
        try {
            saveAge(0);
            System.out.println("保存年龄成功");
        } catch (MyAgeIllegalException e) {
            e.printStackTrace(); // 输出异常信息
            System.out.println("保存年龄失败");
        }
    }

    // 只要年龄小于1岁或大于200岁则非法异常
    public static void saveAge(int age) throws MyAgeIllegalException {
        if (age < 1 || age > 200) {
            // 年龄非法，异常
            throw new MyAgeIllegalException("年龄非法");
        }else {
            System.out.println("年龄合法: " + age);
            System.out.println("保存年龄成功");
        }
    }
}
