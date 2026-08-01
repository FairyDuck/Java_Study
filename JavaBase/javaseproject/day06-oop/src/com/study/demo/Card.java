package com.study.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok技术自动实现getter、setter方法、无参构造器、toString方法
@Data // lombok
@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
public class Card {
    private String carId;
    private String name;
    private String phone;
    private double money;

    // 预存金额
    public void saveMoney(double money) {
        this.money += money;
    }

    // 消费金额
    public void payMoney(double money) {
        this.money -= money;
    }
}
