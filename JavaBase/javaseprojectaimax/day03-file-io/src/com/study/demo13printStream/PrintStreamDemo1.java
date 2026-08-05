package com.study.demo13printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    static void main(String[] args) {
        // 打印流
        try(
                PrintStream ps = new PrintStream(new FileOutputStream("day03-file-io\\src\\file1.txt"));
        ) {
            ps.print("hello");
            ps.println("world");
            ps.println(97);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
