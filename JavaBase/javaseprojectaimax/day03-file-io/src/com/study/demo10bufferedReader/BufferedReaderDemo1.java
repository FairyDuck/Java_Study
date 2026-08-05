package com.study.demo10bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo1 {
    static void main(String[] args) {
        try(
                Reader fr = new FileReader("day03-file-io\\src\\file.txt");
                BufferedReader br = new BufferedReader(fr);

        ) {
            // 循环改进行读取
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            // 目前读取文件最优雅的方案，性能好，不乱码，能行读取
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
