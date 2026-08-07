package com.study.demo1junit;

public class StringUtil {
    public static void printNumber(String name) {
        if(name == null || "".equals(name)) {
            System.out.println("请输入正确的名字");
            return;
        }
        System.out.println("名字长度为: " + name.length());
    }

    /**
     * 求字符串的最大索引
     */
    public static int getMaxIndex(String data) {
        if(data == null || "".equals(data)) {
            return -1;
        }
        return data.length() - 1;
    }
}
