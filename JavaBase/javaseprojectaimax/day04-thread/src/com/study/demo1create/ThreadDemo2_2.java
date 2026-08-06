package com.study.demo1create;

public class ThreadDemo2_2 {
    static void main(String[] args) {
        // 创建线程方式2: 实现Runnable接口的匿名内部类
        MyRunnable myRunnable = new MyRunnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("创建线程方式2: " + i);
                }
            }
        };
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程: " + i);
        }
    }
}
