package com.study.demo9bufferedInputStream;

import java.io.*;

public class BufferedInputStreamDemo1 {
    static void main(String[] args) {
        copyFile("day03-file-io\\src\\file.txt", "day03-file-io\\src\\file1.txt");
    }

    static void copyFile(String srcPath, String destPath) {

        try(
                // 结束后会自动关闭资源，此处只能放资源对象
                // 输入流
                InputStream fis = new FileInputStream(srcPath);
                InputStream bis = new BufferedInputStream(fis);
                // 输出流
                OutputStream fos = new FileOutputStream(destPath);
                OutputStream bos = new BufferedOutputStream(fos);
        ) {

            // 读取并复制
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
