package com.study.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    static void main(String[] args) {
        // 完成一个多线程的综合案例
        List<Integer> redPockets = getRedPockets();
        // 2、定义线程类，100个线程抢红包
        for(int i = 0;i < 100;i++) {
            new PeopleGetRedPocket(redPockets, "线程" + i).start();
        }
    }

    // 1、准备200个随机金额的红包，放到list中返回
    public static List<Integer> getRedPockets() {
        List<Integer> redPockets = new ArrayList<>();
        Random rd = new Random();
        for(int i = 0;i < 160;i++) {
            redPockets.add(rd.nextInt(30) + 1);
        }
        for(int i = 0;i < 40;i++) {
            redPockets.add(rd.nextInt(70) + 31);
        }
        return redPockets;
    }
}
