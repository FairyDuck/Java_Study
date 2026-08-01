package com.study.constructor;

public class Test {
    static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("王伟伟", 18, '男');
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);
    }
}
