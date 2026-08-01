package com.study.capsulation;

// 封装: 合理暴露，合理隐藏
public class Student {
    // 隐藏: 使用private关键字修饰，只能在本类中被直接访问
    // 暴露: 使用public关键字修饰，本类、本包、子类、其他包都可以访问
    String name;
    private int age;
    private double chinese;
    private double math;

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄输入有误");
        }
    }

    public int getAge() {
        return age;
    }

    public void printAllScore() {
        System.out.println(name + "的总成绩是: " + (chinese + math));
    }
}
