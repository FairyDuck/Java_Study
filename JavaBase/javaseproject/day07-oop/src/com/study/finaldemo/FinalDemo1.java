package com.study.finaldemo;

public class FinalDemo1 {
    static void main(String[] args) {
        // 3、final修饰变量，只能赋值一次，变量不能被修改
        // final修饰静态变量，静态变量不能被修改，通常用来保存常量/地址信息
        final int a = 10;
//        a = 11; // 不能修改
        buy(0.8);

        // 4、final修饰引用类型的变量，地址不能改变，但是其中对象可以改变
        final int[] arr = new int[]{1,2,3};
        arr[0] = 11;
    }
    public static void buy(final double price){
        System.out.println("价格：" + price);
    }
}

// 1、final修饰类，类不能被继承
final class A{

}

// 2、final修饰方法，方法不能被重写
class B{
    final void show(){
        System.out.println("Bshow");
    }
}
class C extends B{
    // @Override
    // void show(){
    //     System.out.println("Cshow");
    // }
}
