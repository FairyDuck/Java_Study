package com.study.demo7fileReader;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    static void main(String[] args) {
        // 掌握文件字符输入流使用
        try (
                Reader fr = new FileReader("day03-file-io\\src\\file.txt");
        ) {
            // 定义一个字符数组，每次读取多个字符
            char[] chars = new char[3];
            int len;
            while ((len = fr.read(chars)) != -1) {
                System.out.print(new String(chars, 0, len));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
