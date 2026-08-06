package com.study.demo4synchronizedCode;

public class ThreadDemo1 {
    static void main(String[] args) {
        // 解决线程安全的问题：同步代码块
        // 1、设计一个账户类
        Account account1 = new Account("123456", 100000);
        // 2、设计线程类，创建两个线程，模拟两个线程同时取100000元
        new DrawThread("取钱线程1", account1).start();
        new DrawThread("取钱线程2", account1).start();



        Account account2 = new Account("123456", 100000);
        new DrawThread("取钱线程3", account2).start();
        new DrawThread("取钱线程4", account2).start();
    }
}
