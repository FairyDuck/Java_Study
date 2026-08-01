package com.study.interface3;

public class ClassDataInterImpl1 implements ClassDataInter {
    private Student[] students;
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfo() {
        System.out.println("所有学生信息:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSex() + " " + student.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        System.out.println("平均分:");
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        System.out.println(sum / students.length);
    }
}
