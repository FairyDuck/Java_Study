package com.study.demo4proxy;

public class Test {
    static void main(String[] args) {
        // 学习代理
        // 1、创建明星对象
        Star star = new Star("明星");
        // 2、创建代理对象
        StarService proxy = ProxyUtil.getProxy(star);
        proxy.sing("《Proxy》");
        System.out.println(proxy.dance());
    }
}
