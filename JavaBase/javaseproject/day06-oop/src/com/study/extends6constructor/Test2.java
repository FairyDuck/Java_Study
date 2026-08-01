package com.study.extends6constructor;

public class Test2 {
    static void main(String[] args) {
        // 子类构造器调用父类构造器的应用场景  --创建对象时，方便初始化相关数据
        // 1、先调用父类构造器，初始化name、sex
        // 2、再调用子类构造器，初始化skill
        Teacher t = new Teacher("张三", '男', "软件工程");
    }
}
