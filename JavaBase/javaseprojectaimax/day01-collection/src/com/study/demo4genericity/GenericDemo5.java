package com.study.demo4genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    static void main(String[] args) {
        // 通配符和上下限

    }

    // 通配符，可以在使用泛型的时候代表一切类型
    // 上下限
    // ? extends Car 表示 Car 或者 Car 的子类
    // ? super Car 表示 Car 或者 Car 的父类
    public static void go(ArrayList<? extends Car> cars) {

    }
}
