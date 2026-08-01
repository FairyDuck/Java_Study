package com.study.staticfield;

public class Test2 {
    static void main(String[] args) {
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.count);
    }
}
