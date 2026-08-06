package com.study.demo1create;

public class ThreadDemo2 {
    static void main(String[] args) {
        // 创建线程方式2: 实现Runnable接口
        // 3、创建一个Runnable接口
        MyRunnable myRunnable = new MyRunnable();
        // 4、创建一个Thread类对象，构造方法中传递Runnable接口的实现对象
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程: " + i);
        }
    }
}

// 1、定义一个线程人物类，实现Runnable接口
class MyRunnable implements Runnable {
    // 2、重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("创建线程方式2: " + i);
        }
    }
}
