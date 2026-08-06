package com.study.demo4synchronizedCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    public void drawMoney(double money) {
        // 拿到当前是谁在取钱
        String name = Thread.currentThread().getName();
        // 使用this，只锁当前对象
        // 对于实例方法，建议用this作为锁对象
        // 对于静态方法，建议使用类名.class作为锁对象
        synchronized (this) {
            // 判断余额
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取钱金额：" + money);
                this.money -= money;
                System.out.println("余额为：" + this.money);
            }else {
                System.out.println(name + "取钱失败，余额不足");
            }
        }
    }
}
