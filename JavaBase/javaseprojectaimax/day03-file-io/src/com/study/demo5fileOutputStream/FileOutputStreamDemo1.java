package com.study.demo5fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    static void main(String[] args) throws IOException {
//        OutputStream os = new FileOutputStream("day03-file-io\\src\\file.txt"); // 每次覆盖原来数据
        OutputStream os = new FileOutputStream("day03-file-io\\src\\file.txt", true); // 每次不覆盖原来数据

        os.write(97);
        os.write(98);
        os.write("\r\n".getBytes());

        // 写一个数组
        byte[] bytes = "中国666".getBytes();
        os.write(bytes);

        os.write(bytes, 0, 3);
        os.close();
    }
}
