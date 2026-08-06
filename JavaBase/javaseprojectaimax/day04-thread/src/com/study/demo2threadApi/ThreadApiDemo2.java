package com.study.demo2threadApi;

public class ThreadApiDemo2 {
    static void main(String[] args) {
        // 认识Thread类的Sleep方法（线程休眠）
        for (int i = 0; i < 5; i++) {
            System.out.println("main线程: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
