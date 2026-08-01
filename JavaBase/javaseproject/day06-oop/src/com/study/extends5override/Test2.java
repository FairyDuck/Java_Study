package com.study.extends5override;

public class Test2 {
    static void main(String[] args) {
        // 方法重写常见应用场景: 子类重写Object类的toString方法
        Student s = new Student("张三", '男', 18);
        System.out.println(s); // 相当于System.out.println(s.toString())，输出地址 com.study.extends5override.Student@8efb846
        System.out.println(s.toString());
        // 1、直接输出对象，相当于调用Object类中的toString方法（可以省略不写toString），返回对象的地址信息
        // 2、实际使用过程中需重写toString方法，可直接生成
    }
}

// 默认继承Object类
class Student {
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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
}
