package com.study;

public class ArrayTest1 {
    static void main(String[] args) {
        // 完成斗地主的创建牌和洗牌
        start();
    }

    public static void start() {
        // 创建牌
        String[] poker = new String[54];
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                poker[i * 4 + j] = colors[j] + numbers[i];
            }
        }
        poker[poker.length - 1] = "小王";
        poker[poker.length - 2] = "大王";

        System.out.println("牌已经创建完毕");
        for (String s : poker) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 洗牌 -打乱牌
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int)(Math.random() * poker.length);
            int index2 = (int)(Math.random() * poker.length);
            String temp = poker[index1];
            poker[index1] = poker[index2];
            poker[index2] = temp;
        }
        for (String s : poker) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
