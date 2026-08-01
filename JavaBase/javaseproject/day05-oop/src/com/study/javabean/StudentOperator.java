package com.study.javabean;

public class StudentOperator {
    // 拿到处理的学生对象
    private Student student;
    public StudentOperator(Student student) {
        this.student = student;
    }

    // 提供方法
    public void printAllScore() {
        System.out.println(student.getName() + "总成绩: " + (student.getChinese() + student.getMath()));
    }

    public void printAverageScore() {
        System.out.println(student.getName() + "平均成绩: " + (student.getChinese() + student.getMath()) / 2);

    }
}
