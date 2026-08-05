package com.study.demo1file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    static void main(String[] args) throws IOException {
        // 认识file
        // 1、创建File对象
        File file = new File("C:\\Users\\Hzp\\Desktop\\Java\\JavaBase\\javaseprojectaimax\\day03-file-io\\src\\com\\study\\demo1file\\FileDemo1.java");
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        // 2、可以使用相对路径定位文件对象
        File file1 = new File("day03-file-io\\src\\file.txt");
        System.out.println(file1.length());

        // 3、创文对象代表不存在的文件路径
        File file2 = new File("day03-file-io\\src\\file1.txt");
        System.out.println(file2.exists());
        System.out.println(file2.createNewFile());

        // 4、创建对象代表不存在的目录
        File file3 = new File("day03-file-io\\src\\file");
        System.out.println(file3.exists());
        System.out.println(file3.mkdir());
        // 创建多级文件夹
        File file4 = new File("day03-file-io\\src\\file\\file1\\file2");
        System.out.println(file4.mkdirs());

        // 5、创建file对象代表文件，删除文件
        File file5 = new File("day03-file-io\\src\\file\\file1\\file2");
        System.out.println(file5.delete()); // 只能删文件、空文件夹
        File file6 = new File("day03-file-io\\src\\file1.txt");
        System.out.println(file6.delete());

        // 6、获取某个目录下的全部文件的名称
        File file7 = new File("day03-file-io\\src\\file");
        String[] names = file7.list(); // 仅一级名称
        for (String name : names) {
            System.out.println(name);
        }
        File[] files = file7.listFiles(); // 一级文件对象，对象必须是文件夹才行
        for (File now : files) {
            System.out.println(now.getAbsoluteFile()); // 获取绝对路径
        }
    }
}
