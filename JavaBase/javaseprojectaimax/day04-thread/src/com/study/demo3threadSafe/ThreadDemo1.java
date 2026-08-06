package com.study.demo3threadSafe;

public class ThreadDemo1 {
    static void main(String[] args) {
        // 模拟线程安全问题
        // 1、设计一个账户类
        Account account = new Account("123456", 100000);

        // 2、设计线程类，创建两个线程，模拟两个线程同时取100000元
        new DrawThread("取钱线程1", account).start();
        new DrawThread("取钱线程2", account).start();
    }
}
