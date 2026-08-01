package com.study.demo;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        // 1、创建卡片类，以便创建金卡/银卡，封装车主数据
        // 2、定义卡片父类Card，包含金卡/银卡公共属性
        // 3、金卡类、银卡类继承卡片类
        // 4、办金卡，创建对象，在支付机上进行相关操作
        GoldCard goldCard = new GoldCard("车牌", "名字", "电话", 5000);
        pay(goldCard);
        SilverCard silverCard = new SilverCard("车牌", "名字", "电话", 2000);
    }

    // 支付机
    public static void pay(Card card) {
        System.out.println("请输入金额: ");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.payMoney(money);
    }
}
