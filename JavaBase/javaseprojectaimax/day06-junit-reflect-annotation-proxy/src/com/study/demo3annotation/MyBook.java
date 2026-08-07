package com.study.demo3annotation;

public @interface MyBook {
    String name();
    int age() default 18;
    String[] address();
}
