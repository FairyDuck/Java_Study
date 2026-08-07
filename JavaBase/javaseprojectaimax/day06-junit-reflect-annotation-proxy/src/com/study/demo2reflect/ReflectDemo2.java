package com.study.demo2reflect;

import org.junit.Test;

import java.lang.module.Configuration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {

    @Test
    public void getClassInfo() {
        // 获取类的信息，并对其操作
        // 1、获取Class对象
        Class c1 = Student.class;
        System.out.println(c1.getName()); // com.study.demo2reflect.Student
        System.out.println(c1.getSimpleName()); // Student
    }

    @Test
    public void getConstructorInfo() throws Exception {
        // 获取构造方法
        Class c1 = Dog.class;
        Constructor[] cons  = c1.getDeclaredConstructors(); // 获取所有构造器
        for(Constructor con : cons) {
            System.out.println(con.getName() + " " + con.getParameterCount());
        }
        // 获取单个构造器
        Constructor con = c1.getDeclaredConstructor(String.class, int.class); // 获取指定参数的构造器
        System.out.println(con.getName() + " " + con.getParameterCount());
        Constructor con2 = c1.getDeclaredConstructor(); // 获取无参构造器
        System.out.println(con2.getName() + " " + con2.getParameterCount());

        // 获取到构造器后，依然是为了创建对象
        con2.setAccessible(true); // 暴力反射，可以绕过权限
        Dog dog1 = (Dog) con2.newInstance(); // 构造器私有，无法创建，但可以暴力反射后创建
    }

    // 获取成员变量并进行操作
    @Test
    public void getFieldInfo() throws Exception {
        Class c1 = Student.class;
        Field[] fields = c1.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }
        Field field = c1.getDeclaredField("name");
        System.out.println(field.getName() + " " + field.getType());

        // 获取成员变量依然是为了赋值和获取成员变量的值
        Student student = new Student();
        field.setAccessible(true);
        field.set(student, "张三");
        field.set(student, 18);
    }

    // 获取成员方法并进行操作
    @Test
    public void getMethodInfo() throws Exception {
        Class c1 = Dog.class;
        Method[] methods = c1.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType());
        }
        Method method = c1.getDeclaredMethod("show", String.class);
        System.out.println(method.getName() + " " + method.getReturnType());

        // 获取成员方法依然是为了调用成员方法
        Dog dog = new Dog("张三", 18);
        method.setAccessible(true);
        method.invoke(dog, "张三");
    }
}
