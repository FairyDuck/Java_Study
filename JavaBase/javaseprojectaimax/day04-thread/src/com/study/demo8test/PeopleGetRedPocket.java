package com.study.demo8test;

import java.util.List;

public class PeopleGetRedPocket extends Thread {
    private List<Integer> redPocketList;
    public PeopleGetRedPocket(List<Integer> redPocketList, String name) {
        super(name);
        this.redPocketList = redPocketList;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            // 100个人抢红包
            synchronized (redPocketList) {
                if(redPocketList.size() == 0) {
                    break;
                }
                int index = (int)(Math.random() * redPocketList.size());
                Integer money = redPocketList.remove(index);
                System.out.println(name + "抢到红包：" + money);
                if(redPocketList.size() == 0) {
                    System.out.println("抢完红包");
                }
            }
        }
    }
}
