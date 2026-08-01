package com.study.demo;

// 金卡消费打8折
public class GoldCard extends  Card {
    public GoldCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void payMoney(double money) {
        System.out.println("消费金额: " + money);
        System.out.println("金卡支付: " + money * 0.8);
        if(money * 0.8 <= getMoney()) {
            setMoney(getMoney() - money * 0.8);
            // 判断单次消费大于200，调用独有洗车票功能
            if(money * 0.8 >= 200){
                printWashCarTicket();
            }
        } else {
            System.out.println("余额不足");
        }
    }

    // 打印洗车票
    public void printWashCarTicket() {
        System.out.println("洗车票");
    }
}
