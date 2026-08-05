package com.study.demo13printStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo2 {
    static void main(String[] args) {
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io\\src\\file1.txt"));
        ) {
            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeDouble(3.14);
            dos.writeUTF("hello world");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
