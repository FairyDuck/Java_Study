package com.study.demo3genericity;

public class GenericDemo3 {
    static void main(String[] args) {
        // 学习泛型接口
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        studentData.update(new Student());
        studentData.query(1);
    }
}
