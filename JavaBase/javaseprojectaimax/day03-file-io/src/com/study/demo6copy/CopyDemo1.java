package com.study.demo6copy;

import java.io.*;

public class CopyDemo1 {
    static void main(String[] args) {
        // 字节流适合对文件做赋值
        // 实现文件的赋值
        copyFile("day03-file-io\\src\\file.txt", "day03-file-io\\src\\file1.txt");
    }

    static void copyFile(String srcPath, String destPath) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            // 输入流
            fis = new FileInputStream(srcPath);
            // 输出流
            fos = new FileOutputStream(destPath);
            // 读取并复制
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 最后一定会执行一次，不管 try catch 中是否出现异常
            // 关闭流
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(fis != null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
