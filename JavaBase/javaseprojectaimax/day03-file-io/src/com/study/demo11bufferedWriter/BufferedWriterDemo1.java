package com.study.demo11bufferedWriter;

import java.io.*;

public class BufferedWriterDemo1 {
    static void main(String[] args) {
        try(
                Writer fw = new FileWriter("day03-file-io\\src\\file.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);

        ) {
            bw.write("hello world");
            bw.newLine(); // 换行
            bw.write("hello world", 0, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
