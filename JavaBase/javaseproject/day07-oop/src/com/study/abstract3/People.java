package com.study.abstract3;

public abstract class People {
    // 多用final修饰模板方法，避免被修改，不能重写
    public final void write(){
        System.out.println("标题");
        // 定义一个抽象方法，用于子类实现
        writeMain();
        System.out.println("结尾");
    }
    public abstract void writeMain();
}
