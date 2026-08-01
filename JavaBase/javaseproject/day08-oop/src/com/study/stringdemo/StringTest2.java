package com.study.stringdemo;

public class StringTest2 {
    static void main(String[] args) {
        // 生成目标位数的验证码
        System.out.println(getCode(4));
    }

    // 验证码中可以有大写字母、小写字母、数字
    public static String getCode(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random() * str.length());
            code += str.charAt(index);
        }
        return code;
    }
}
