package com.study.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    static void main(String[] args) {
        String info = "1,张三,男,2026-05-06 11:11:11,北京-天安门#2,李四,女,2026-05-06 22:22:22,北京-长城";
        // 转换成Student对象
        List<Student> list = parseStudents(info);
        System.out.println(list);
    }
    public static List<Student> parseStudents(String info) {
        List<Student> list = new ArrayList<>();
        String[] students = info.split("#");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (String student : students) {
            String[] values = student.split(",");
            String time = values[3];
            LocalDateTime localDateTime = LocalDateTime.parse(time, dtf);
            Student s = new Student(Integer.parseInt(values[0]), values[1], values[2], localDateTime, values[4]);
            list.add(s);
        }
        return list;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    public int id;
    private String name;
    private String sex;
    private LocalDateTime LocalDateTime;
    private String address;
}
