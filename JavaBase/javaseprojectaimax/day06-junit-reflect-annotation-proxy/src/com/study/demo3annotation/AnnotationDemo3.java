package com.study.demo3annotation;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationDemo3 {
    @Test
    public void parseClass() {
        Class c1 = Demo.class;
        if(c1.isAnnotationPresent(MyTest2.class)) {
            MyTest2 annotation = (MyTest2) c1.getDeclaredAnnotation(MyTest2.class);

            String[] address = annotation.address();
            double height = annotation.height();
            String value = annotation.value();
            System.out.println(address);
            System.out.println(height);
            System.out.println(value);
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c1 = Demo.class;
        Method methods = c1.getMethod("show");
        if(methods.isAnnotationPresent(MyTest2.class)) {
            MyTest2 annotation = methods.getDeclaredAnnotation(MyTest2.class);
            String[] address = annotation.address();
            double height = annotation.height();
            String value = annotation.value();
            System.out.println(address);
            System.out.println(height);
            System.out.println(value);
        }
    }
}
