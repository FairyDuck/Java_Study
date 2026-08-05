package com.study.demo4test;

import java.util.*;

public class Room {
    // 准备54张牌，定义一个集合容器，保存54张牌
    private List<Card> cards = new ArrayList<>();
    // 初始化牌，实例代码块
    {
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int num = 0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                cards.add(new Card(size, color, num));
            }
        }
        cards.add(new Card("小王", "", ++num));
        cards.add(new Card("大王", "", ++num));
    }
    public void start() {
        // 洗牌
        Collections.shuffle(cards);
        // 发牌: 三个玩家，每家17张牌
        Map<String, List<Card>> players = new HashMap<>();
        players.put("玩家1", new ArrayList<>());
        players.put("玩家2", new ArrayList<>());
        players.put("玩家3", new ArrayList<>());
        for (int i = 0; i < 17; i++) {
            players.get("玩家1").add(cards.get(i));
            players.get("玩家2").add(cards.get(i + 17));
            players.get("玩家3").add(cards.get(i + 34));
        }
        // 剩三张牌
        List<Card> left = cards.subList(51, 54);
        System.out.println("底牌：" + left);
        // 假设玩家1抢到了地主
        players.get("玩家1").addAll(left);

        // 排序每个玩家的牌
        sortCards(players.get("玩家1"));
        sortCards(players.get("玩家2"));
        sortCards(players.get("玩家3"));

        // 每个人看牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            System.out.println();
        }
    }

    // 排序
    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum() - o1.getNum();
            }
        });
    }
}
