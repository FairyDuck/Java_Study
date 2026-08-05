package com.study.demo1file;

import java.io.File;

public class FileDemo2 {
    static void main(String[] args) {
        // 掌握file遍历一级文件对象的操作
        File file = new File("day03-file-io\\src\\file.txt");
        File[] files = file.listFiles();
        System.out.println( files); // 对象是文件，返回null


        // 主调是文件，返回null
        // 主调是空文件夹，返回空数组
        // 主调是文件夹，返回文件或者文件夹对象数组
        // 主调是文件夹，返回所有文件和文件夹，包含隐藏文件
        // 主调是文件夹，没权先访问该文件夹时，返回null
    }
}
