package com.study.interface1;

public class Test {
    static void main(String[] args) {
        // 认识接口
        // 注意: 接口不能创建对象
        System.out.println(A.SCHOOL_NAME);
    }
}

// C称为实现类，可以同时实现多个接口
// 实现类实现多个接口，必须重写全部接口的全部抽象方法，否则必须实现成抽象类
class C implements A, B {
    @Override
    public void run() {

    }

    @Override
    public String go() {
        return "";
    }

    @Override
    public void paly() {

    }
}
