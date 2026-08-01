package com.study.interface3;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfo() {
        System.out.println("所有学生信息:");
        int cnt = 0;
        for (Student student : students) {
            if(student.getSex() == '男') cnt++;
            System.out.println(student.getName() + " " + student.getSex() + " " + student.getScore());
        }
        System.out.println("男性学生人数:" + cnt);
    }

    @Override
    public void printAverageScore() {
        double mn = students[0].getScore();
        double mx = students[0].getScore();
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
            if(student.getScore() < mn) mn = student.getScore();
            if(student.getScore() > mx) mx = student.getScore();
        }
        System.out.println("平均分: " + sum / students.length);
        System.out.println("最高分: " + mx);
        System.out.println("最低分: " + mn);
    }
}
