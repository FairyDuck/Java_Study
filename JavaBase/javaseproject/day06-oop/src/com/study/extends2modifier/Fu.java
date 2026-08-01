package com.study.extends2modifier;

// 修饰词范围: private < default < protected < public
public class Fu {
    // private 仅本类中访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    // 缺失 本包中访问
    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    // protected 本包及子孙类中访问(非本包类子类也可以访问)
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    // public 所有类中访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
