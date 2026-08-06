package com.study.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    static void main(String[] args) {
        // 创建线程方式3: 实现Callable接口，可以获取线程执行完毕后的结果
        // 3、创建Callable接口的实现类
        Callable<Integer> myCallable1 = new MyCallable(100);
        // 4、创建FutureTask类对象，构造方法中传递Callable接口实现类对象
        // 本质是一个Runnable接口实现类对象，可以交给Thread类对象
        // 可以获取Callable接口返回的结果
        FutureTask<Integer> futureTask1 = new FutureTask<>(myCallable1);
        // 5、创建Thread类对象，构造方法中传递FutureTask对象
        Thread thread1 = new Thread(futureTask1);
        thread1.start();


        Callable<Integer> myCallable2 = new MyCallable(50);
        FutureTask<Integer> futureTask2 = new FutureTask<>(myCallable2);
        Thread thread2 = new Thread(futureTask2);
        thread2.start();

        try {
            // 6、获取Callable接口返回的结果
            Integer sum = futureTask1.get();
            System.out.println("1sum: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Integer sum = futureTask2.get();
            System.out.println("2sum: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 1、定义一个线程任务类，实现Callable接口
class MyCallable implements Callable<Integer> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    // 2、重写call方法
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("创建线程方式3: " + i);
            sum += i;
        }
        return sum;
    }
}
