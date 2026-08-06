package com.study.demo7executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo3 {
    static void main(String[] args) {
        // 通过Executors工具类，调用其静态方法实现
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> future1 = executorService.submit(new MyCallable(100));
        Future<String> future2 = executorService.submit(new MyCallable(200));
        Future<String> future3 = executorService.submit(new MyCallable(300));
        Future<String> future4 = executorService.submit(new MyCallable(400));
    }
}
