package com.study.demo2threadApi;


import javax.swing.plaf.TableHeaderUI;

public class ThreadApiDemo1 {
    static void main(String[] args) {
        // 认识线程的常用方法
        MyThread myThread1 = new MyThread("线程1");
//        myThread1.setName("线程1");
        myThread1.start();
        System.out.println(myThread1.getName()); // Thread-索引

        MyThread myThread2 = new MyThread("线程2");
//        myThread2.setName("线程2");
        myThread2.start();
        System.out.println(myThread2.getName()); // Thread-索引

        // 哪个线程运行，哪个线程getName()方法返回值就是哪个线程
        Thread thread = Thread.currentThread(); // 主线程名
    }
}
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " 创建线程方式1: " + i);
        }
    }
}
