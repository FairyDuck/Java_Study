package com.study.demo4fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    static void main(String[] args) throws IOException {
        // 一次性读完文件，避免截断中文字符
        InputStream is = new FileInputStream("day03-file-io\\src\\file.txt");
        // 读完文件，避免中文被截断，但如果文件过大，可能会导致内存溢出
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));
        is.close();
    }
}
