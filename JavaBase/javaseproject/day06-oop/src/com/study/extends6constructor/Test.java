package com.study.extends6constructor;

// 子类构造器
// 创建子类对象时，先调用父类的构造器，再调用子类的构造器
// （如果无相关参数，则直接调用父类的无参构造器）
public class Test {
    static void main(String[] args) {
        Zi zi = new Zi();
    }
}

class Zi extends Fu {
    public Zi() {
        super(); // 默认存在，调用父类的无参构造器
//        super(1); // 指定调用父类的有参构造器
        System.out.println("子类无参构造器");
    }
}

class Fu {
    public Fu() {
        System.out.println("父类无参构造器");
    }

    public Fu(int a) {
        System.out.println("父类有参构造器");
    }
}
