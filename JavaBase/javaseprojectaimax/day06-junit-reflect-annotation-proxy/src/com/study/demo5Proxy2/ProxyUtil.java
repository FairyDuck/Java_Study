package com.study.demo5Proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T> T createProxy(T userService) {
        T proxy = (T) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(userService, args);
                        long end = System.currentTimeMillis();
                        System.out.println(method.getName() + "耗时: " + (end - start) / 1000.0 + "s");
                        return result;
                    }
                });
        return proxy;
    }
}
