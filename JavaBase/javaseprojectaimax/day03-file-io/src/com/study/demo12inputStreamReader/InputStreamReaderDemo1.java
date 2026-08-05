package com.study.demo12inputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo1 {
    static void main(String[] args) {
        // 解决读取不同编码问题
        try(
                InputStream is = new FileInputStream("day03-file-io\\src\\file.txt");
                InputStreamReader isr = new InputStreamReader(is, "GBK");
                BufferedReader br = new BufferedReader(isr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
