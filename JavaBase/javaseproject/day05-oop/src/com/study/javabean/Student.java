package com.study.javabean;

// 实体类
public class Student {
    // 私有化成员变量
    private String name;
    private double chinese;
    private double math;

    // 必须提供无参构造器（如果写了有参构造器，则必须写无参构造器）
    public Student() {
    }

    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    // 公开所有的getter、setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
