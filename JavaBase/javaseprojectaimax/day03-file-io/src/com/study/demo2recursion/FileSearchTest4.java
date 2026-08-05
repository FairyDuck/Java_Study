package com.study.demo2recursion;

import java.io.File;

public class FileSearchTest4 {
    static void main(String[] args) {
        // 实现查找文件
        File file = new File("C:\\Users\\Hzp\\Desktop\\Java\\JavaBase\\javaseprojectaimax\\day03-file-io\\src");
        findFile(file, "file.txt");
    }

    static void findFile(File file, String name) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            return;
        }
        File[] files = file.listFiles();
        for (File now : files) {
            if (now.isFile() && now.getName().contains(name)) {
                System.out.println("找到啦: " + now.getAbsoluteFile());
            }
            if (now.isDirectory()) {
                findFile(now, name);
            }
        }
    }
}
