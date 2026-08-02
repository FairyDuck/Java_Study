package com.study.demo1exception;

// 自定义的编译时异常
public class MyAgeIllegalException extends  Exception{
    public MyAgeIllegalException() {
    }

    public MyAgeIllegalException(String message) { // 异常原因
        super(message);
    }
}
