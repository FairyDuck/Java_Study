package com.study.staticmethod;


public class Test {
    static void main(String[] args) {
        // 类名.静态方法名
        Student.print();

        // 对象名.静态方法名
        Student s1 = new Student();
        s1.print();


        // 对象名.实例方法
        s1.setScore(59.5);
        s1.printPass();



        // 静态方法的应用: 做工具类
        String code = VerifyCodeUtil.getCode(4); // 直接用类名调用
        System.out.println(code);
    }
}
