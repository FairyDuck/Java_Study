package com.study.demo13printStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataStreamDemo3 {
    static void main(String[] args) {
        try(
                DataInputStream dos = new DataInputStream(new FileInputStream("day03-file-io\\src\\file1.txt"));
        ) {
            System.out.println(dos.readInt());
            System.out.println(dos.readBoolean());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
