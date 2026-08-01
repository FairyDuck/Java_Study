package com.study.innerclass3;

public class Test2 {
    static void main(String[] args) {
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生");
            }
        };
        start(s1);

        // 也可以直接写入方法体
        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师");
            }
        });
    }

    public static void start(Swim s) {
        s.swimming();
    }
}

//class Teacher implements Swim {
//    public void swimming() {
//        System.out.println("老师会游泳");
//    }
//}
//
//class Studnet implements Swim {
//    public void swimming() {
//        System.out.println("学生会游泳");
//    }
//}

interface Swim {
    void swimming();
}