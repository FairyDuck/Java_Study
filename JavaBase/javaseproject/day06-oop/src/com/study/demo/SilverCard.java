package com.study.demo;

public class SilverCard extends Card {
    public SilverCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void payMoney(double money) {
        System.out.println("消费金额: " + money);
        System.out.println("金卡支付: " + money * 0.9);
        if(money * 0.9 <= getMoney()) {
            setMoney(getMoney() - money * 0.9);
        } else {
            System.out.println("余额不足");
        }
    }
}
