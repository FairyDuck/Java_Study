package com.study.demo4test;

public class ParamDemo1 {
    static void main(String[] args) {
        // 可变参数
        show(1, 2, 3, 4, 5);
        show(1, 2, 3);
        show(1, 2);
        show(1);
        show();
    }

    // 注: 可变参数在形参列表中只能是最后一个参数，最多只能有一个
    public static void show(int ... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}
