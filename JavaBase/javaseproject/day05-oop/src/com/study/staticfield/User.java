package com.study.staticfield;

public class User {
    public static int count = 0;

    public User() {
        User.count++; // 可能实际count数比实际人数少
    }
}
