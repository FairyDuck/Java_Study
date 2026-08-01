package com.study.object;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Star s1 = new Star();
        s1.name = "王伟伟";
        s1.age = 18;
        s1.gender = "男";
        s1.height = 172.5;
        s1.weight = 80.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);
        s1.printInfo();

    }
}
