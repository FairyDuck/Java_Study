package com.study.demo3annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD}) // 元注解，指定注解作用范围
@Retention(RetentionPolicy.RUNTIME) // 元注解，指定注解保留时间
public @interface MyTest1 {
}
