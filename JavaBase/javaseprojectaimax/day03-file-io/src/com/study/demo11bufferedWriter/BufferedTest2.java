package com.study.demo11bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest2 {
    static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new FileReader("day03-file-io\\src\\file.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("day03-file-io\\src\\file1.txt"));
        ) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            Collections.sort(lines);
            for (String s : lines) {
                bw.write(s);
                bw.newLine();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
