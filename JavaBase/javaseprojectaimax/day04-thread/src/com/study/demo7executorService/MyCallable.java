package com.study.demo7executorService;

import java.util.concurrent.Callable;

// 1、定义一个线程任务类，实现Callable接口
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    // 2、重写call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
//            System.out.println("创建线程方式3: " + i);
            sum += i;
        }
        return Thread.currentThread().getName() + ": " + sum;
    }
}
