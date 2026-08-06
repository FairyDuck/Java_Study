package com.study.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {
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

        // 2、使用线程池对象执行Callable任务，理解线程复用
        Future<String> future1 = executorService.submit(new MyCallable(100));
        Future<String> future2 = executorService.submit(new MyCallable(200));
        Future<String> future3 = executorService.submit(new MyCallable(300));
        Future<String> future4 = executorService.submit(new MyCallable(400));
        Future<String> future5 = executorService.submit(new MyCallable(500));

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
            System.out.println(future4.get());
            System.out.println(future5.get());
        }catch (Exception e) {
            e.printStackTrace();
        }


        // 3、关闭线程池，一般不关闭！
//        executorService.shutdown();
//        executorService.shutdownNow(); // 立即关闭，不管线程是否执行完成
    }
}
