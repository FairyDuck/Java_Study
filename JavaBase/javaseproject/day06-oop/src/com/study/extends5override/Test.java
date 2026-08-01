package com.study.extends5override;

// 继承 方法重写   --声明不变，重新实现
// 1、方法重写时，访问权限必须大于等于父类方法权限，返回范围必须小于等于父类方法范围
// 2、私有、静态方法不允许重写
public class Test {
    static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal {
    // 方法重写: 方法名、参数列表相同
    @Override // 方法重写的校验注解: 要求方法名、参数列表必须一致，否则报错 （用于检测重写格式是否正确，避免手误）
    public void cry() {
        System.out.println("喵喵喵");
    }
}

class Animal {
    public void cry() {
        System.out.println("动物叫");
    }
}

