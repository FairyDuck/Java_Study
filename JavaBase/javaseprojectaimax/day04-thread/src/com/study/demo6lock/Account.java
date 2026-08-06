package com.study.demo6lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lock = new ReentrantLock();
    public void drawMoney(double money) {
        // 拿到当前是谁在取钱
        String name = Thread.currentThread().getName();
        lock.lock();
        try {
            // 判断余额
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取钱金额：" + money);
                this.money -= money;
                System.out.println("余额为：" + this.money);
            }else {
                System.out.println(name + "取钱失败，余额不足");
            }
        } finally {
            lock.unlock();
        }
    }
}
