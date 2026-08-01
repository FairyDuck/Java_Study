package com.study.extends6constructor;

// 子类
public class Teacher extends People {
    private String skill; // 技术

    public Teacher(String name, char sex, String skill) {
        super(name, sex);
        this.skill = skill;
    }

    // getter and setter
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
