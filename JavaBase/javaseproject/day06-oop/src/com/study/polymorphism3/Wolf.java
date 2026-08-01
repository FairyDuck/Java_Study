package com.study.polymorphism3;

public class Wolf extends Animal {
    String name = "狼";
    @Override
    public void run() {
        System.out.println("狼跑");
    }

    public void eatSheep() {
        System.out.println("狼吃羊");
    }
}
