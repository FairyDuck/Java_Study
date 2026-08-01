package com.study.extends6constructor;

// 注意: 构造器中的super、this关键字必须写在最前面，并且super、this不能同时出现
public class Student {
    private String name;
    private char sex;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this(name, sex, age, "黑马"); // 调用兄弟构造器
    }

    public Student(String name, char sex, int age, String schoolName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
