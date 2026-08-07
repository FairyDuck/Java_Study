package com.study.demo2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    static void main(String[] args) {
        List<People> list = new ArrayList<>();
        for(int i = 1;i <= 100;i++) {
            int code = (int)(Math.random() * 200 + 1); // 1-200
            while(isRepeat(list, code)) {
                code = (int)(Math.random() * 200 + 1);
            }
            People p = new People(i,code);
            list.add(p);
        }
        System.out.println("数据生成完毕");

        int cnt = 0;
        while(true) {
            if(list.size() == 1) {
                break;
            }
            List<People> last = new ArrayList<>();
            for(int i = 0;i < list.size();i++) {
                if(cnt == 1) {
                    last.add(list.get(i));
                }
                cnt = 1 - cnt;
            }
            list = last;
        }
        System.out.println(list.get(0).getId());
    }
    public static boolean isRepeat(List<People> list, int code) {
        for(People p: list) {
            if(p.getIndex() == code) {
                return true;
            }
        }
        return false;
    }
}
