package com.hmdp.utils;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 仅需判断是否拦截即可（ThreadLocal中是否有用户）
        if (UserHolder.getUser() == null) {
            // 拦截并返回未登录结果
            response.setStatus(401);
            return false;
        }
        // 放行
        return true;
    }
}
