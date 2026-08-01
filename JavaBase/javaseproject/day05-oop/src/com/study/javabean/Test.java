package com.study.javabean;

public class Test {
    static void main(String[] args) {
        // 实体类的基本作用: 创建对象，封装数据
        Student s1 = new Student();
        s1.setName("王伟伟");
        s1.setChinese(100);
        s1.setMath(100);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());

        // 实体类在开发中的应用场景
        // 创建一个学生的操作对象来负责对学生数据进行处理
        StudentOperator operator = new StudentOperator(s1);
        operator.printAllScore();
        operator.printAverageScore();
    }
}
