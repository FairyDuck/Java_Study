package com.study.staticfield;


public class Test {
    static void main(String[] args) {
        // 类名.静态字段名 -推荐
        Student.name = "张三";
        System.out.println(Student.name);

        // 对象名.静态字段名 -不推荐
        Student s1 = new Student();
        s1.name = "王伟伟";
        System.out.println(Student.name);

        // 对象名.实例变量
        s1.age = 23;
        System.out.println(s1.age);
    }
}
