package com.study.demo1exception;

public class ExceptionDemo4 {
    static void main(String[] args) {
        // 认识自定义异常
        saveAge(0);
    }

    // 只要年龄小于1岁或大于200岁则非法异常
    public static void saveAge(int age) throws MyAgeIllegalRuntimeException {
        if (age < 1 || age > 200) {
            // 年龄非法，异常
            throw new MyAgeIllegalRuntimeException("年龄非法");
        }else {
            System.out.println("年龄合法: " + age);
            System.out.println("保存年龄成功");
        }
    }
}
