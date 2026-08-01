package com.study.object;

// 明星类
// 封装: 把数据和对数据的处理都放到同一个类中
public class Star {
    String name;
    int age;
    String gender;
    double height;
    double weight;

    public void printInfo() {
        System.out.println("姓名：" + name + "\n年龄：" + age + "\n性别：" + gender + "\n身高：" + height + "\n体重：" + weight);
    }
}
