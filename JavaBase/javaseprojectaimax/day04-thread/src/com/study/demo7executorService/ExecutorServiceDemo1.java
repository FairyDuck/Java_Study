package com.study.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    static void main(String[] args) {
        // 创建线程池
        // 1、使用线程池的实现类ThreadPoolExecutor，声明七个参数来构建线程池对象
        ExecutorService executorService = new ThreadPoolExecutor(
                3, // 核心线程数
                5, // 最大线程数
                1000, // 线程空闲时间，出来核心线程外的线程存活时间
                TimeUnit.MILLISECONDS, // 线程空闲时间单位
                new ArrayBlockingQueue<>(3), // 阻塞队列
                Executors.defaultThreadFactory(), // 线程工厂
                new ThreadPoolExecutor.AbortPolicy() // 拒绝策略
        );

        // 2、使用线程池对象执行Runnable任务，理解线程复用
        Runnable myRunnable = new MyRunnable();
        executorService.execute(myRunnable); // 1
        executorService.execute(myRunnable); // 2
        executorService.execute(myRunnable); // 3 核心线程数已满，进入阻塞队列，等待核心线程数空闲
        executorService.execute(myRunnable); // 4
        executorService.execute(myRunnable); // 5
        executorService.execute(myRunnable); // 6 阻塞队列已满，进入最大线程数，等待阻塞队列空闲
        executorService.execute(myRunnable); // 7 开始创建新的临时线程
        executorService.execute(myRunnable); // 8
        executorService.execute(myRunnable); // 9 线程已达max，阻塞队列已满，进入拒绝策略

        // 3、关闭线程池，一般不关闭！
//        executorService.shutdown();
//        executorService.shutdownNow(); // 立即关闭，不管线程是否执行完成
    }
}
