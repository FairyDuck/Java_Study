package com.study.demo4test;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String size;
    private String color;
    private int num; // 牌的大小

    @Override
    public String toString() {
        return size + color;
    }
}
