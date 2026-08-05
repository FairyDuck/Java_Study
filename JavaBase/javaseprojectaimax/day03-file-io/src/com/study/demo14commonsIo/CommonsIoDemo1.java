package com.study.demo14commonsIo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIoDemo1 {
    static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("day03-file-io\\src\\file.txt"), new File("day03-file-io\\src\\file1.txt"));
    }
}
