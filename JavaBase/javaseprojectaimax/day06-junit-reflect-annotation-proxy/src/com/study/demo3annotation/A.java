package com.study.demo3annotation;

public @interface A {
    String value(); // 特殊属性，如果只有一个value属性，可以省略value
    String hobby() default "看电影";
}
