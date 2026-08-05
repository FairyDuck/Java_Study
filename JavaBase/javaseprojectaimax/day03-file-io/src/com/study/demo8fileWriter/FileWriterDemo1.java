package com.study.demo8fileWriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    static void main(String[] args) {
        try (
                Writer fw = new FileWriter("day03-file-io\\src\\file.txt", true);
        ) {
            fw.write("hello world");
            fw.write("\r\n");
            fw.write("hello world");
            fw.write("\r\n");
            fw.write("hello world");

            // 写完后，必须刷新，才能成功写入文件
            fw.flush();
            fw.close(); // 关闭包含了刷新
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
