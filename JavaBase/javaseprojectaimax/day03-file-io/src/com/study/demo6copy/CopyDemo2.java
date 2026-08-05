package com.study.demo6copy;

import java.io.*;

public class CopyDemo2 {
    static void main(String[] args) {
        // 字节流适合对文件做赋值
        // 实现文件的赋值
        copyFile("day03-file-io\\src\\file.txt", "day03-file-io\\src\\file1.txt");
    }

    static void copyFile(String srcPath, String destPath) {

        try(
                // 结束后会自动关闭资源，此处只能放资源对象
                // 输入流
                InputStream fis = new FileInputStream(srcPath);
                // 输出流
                OutputStream fos = new FileOutputStream(destPath);
            ) {

            // 读取并复制
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
