package com.study.demo4synchronizedCode;

// 取钱线程类
public class DrawThread extends Thread {
    private Account account;
    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }
    @Override
    public void run() {
        account.drawMoney(100000);
    }
}
