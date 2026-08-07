package com.study.demo2reflect;

public class Dog {
    private String name;
    private int age;

    private Dog(){
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(String name){
        System.out.println("name: " + name + " age: " + age);
    }
}
