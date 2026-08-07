package com.study.demo4proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 代理工具类
public class ProxyUtil {
    // 擦黄健一个对象的代理对象返回
    public static StarService getProxy(Star star) {
        /**
         * 参数一 ： 类加载器
         * 参数二 ： 创建代理对象时，指定代理对象的接口
         * 参数三 ： 指定代理类如何去代理
         */
        StarService starService = (StarService) Proxy.newProxyInstance(star.getClass().getClassLoader(),
                star.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 声明代理要做的事
                        /**
                         * 参数一  proxy接收到代理对象本身
                         * 参数二  method 接收到代理对象方法（正在被代理的方法）
                         * 参数三  args 接收到代理对象方法参数
                         */
                        if(method.getName().equals("sing")) {
                            System.out.println("开始代理sing方法");
                        }else if(method.getName().equals("dance")) {
                            System.out.println("开始代理dance方法");
                        }
                        Object result = method.invoke(star, args);
                        return result;
                    }
                });
        return starService;
    }
}
