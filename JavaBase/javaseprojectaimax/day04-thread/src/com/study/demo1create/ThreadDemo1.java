package com.study.demo1create;

public class ThreadDemo1 {
    static void main(String[] args) {
        // 创建线程方式1: 继承Thread类
        MyThread myThread = new MyThread();
        // 如果调用的run方法，则线程不会启动，依旧是单线程运行
        // 只有调用start方法，才会启动线程，并执行run方法
        myThread.start();
        // 不要把主线程放到子线程以前启动
        for (int i = 0; i < 5; i++) {
            System.out.println("main线程: " + i);
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("创建线程方式1: " + i);
        }
    }
}
