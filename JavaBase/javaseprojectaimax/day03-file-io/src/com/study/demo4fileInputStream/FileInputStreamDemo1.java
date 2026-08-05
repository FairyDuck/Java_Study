package com.study.demo4fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    static void main(String[] args) throws IOException {
        // 掌握字节输入流的使用
        // 1、创建文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("day03-file-io\\src\\file.txt");

        // 2、开始读取文件中的字符并输出: 每次读一个
        int b; // 用于记录每次读取的字符
        // 读到末尾为-1
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }
        // 每次只读取一个字符，效率低，且读取汉字一定会乱码 （一个汉字在utf-8占3个字节）

        InputStream is1 = new FileInputStream("day03-file-io\\src\\file.txt");
        // 3、每次读取多个字节
        byte[] bytes = new byte[3]; // 创建一个字节数组，用于保存每次读取的字节
        int len; // 记录每次读取的字节个数
        while ((len = is1.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
        // 每次读取多个字节，性能提高，但读取的汉字没有正好被包含完全，则也会乱码 （可能截断汉字编码）

        is.close();
    }
}
