package com.study.interface2;

public class Test {
    static void main(String[] args) {
        // 认识接口的好处
        // 1、弥补了单继承的不足，一个类可以同时实现多个接口
        People p = new Student();
        Driver d = new Student();
        BoyFriend bf = new Student();
        // 2、让程序可以面向接口编程
    }
}

interface Driver{}
interface BoyFriend{}

class People{}
class Student extends People implements Driver, BoyFriend{}
