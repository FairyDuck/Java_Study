package com.study.demo2threadApi;

public class ThreadApiDemo3 {
    static void main(String[] args) {
        // 认识线程的join方法，让调用方法的线程插队，提前完成
        MyThread2 myThread1 = new MyThread2();
        myThread1.start();

        for(int i = 1;i <= 5;i++) {
            System.out.println("main线程: " + i);
            if(i == 1) {
                try {
                    myThread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +"MyThread2线程: " + i);
        }
    }
}
