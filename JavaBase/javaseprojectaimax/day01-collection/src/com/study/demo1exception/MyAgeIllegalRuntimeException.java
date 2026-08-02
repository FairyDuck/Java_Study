package com.study.demo1exception;

// 自定义的运行时异常
public class MyAgeIllegalRuntimeException extends  RuntimeException{
    public MyAgeIllegalRuntimeException() {
    }

    public MyAgeIllegalRuntimeException(String message) { // 异常原因
        super(message);
    }
}
