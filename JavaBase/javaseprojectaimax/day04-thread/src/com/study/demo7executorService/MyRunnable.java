package com.study.demo7executorService;

// 1、定义一个线程人物类，实现Runnable接口
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "创建线程方式2: " + i);
            try {
                Thread.sleep(1000000000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
