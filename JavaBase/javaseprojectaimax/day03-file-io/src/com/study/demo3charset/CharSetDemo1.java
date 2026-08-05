package com.study.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    static void main(String[] args) throws UnsupportedEncodingException {
        // 实现字符编码解码
        // 编码
        String s = "中国";
//        byte[] bytes = s.getBytes();
        byte[] bytes = s.getBytes("utf-8");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 解码
        String s1 = new String(bytes);
        System.out.println(s1);
    }
}
