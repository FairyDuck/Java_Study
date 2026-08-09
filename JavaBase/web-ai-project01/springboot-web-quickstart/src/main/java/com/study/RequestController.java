package com.study;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        // 1、获取请求方式
        String method = request.getMethod();
        System.out.println("求情方式: " + method);
        // 2、获取请求路径
        String url = request.getRequestURL().toString();
        System.out.println("请求路径: " + url);
        String uri = request.getRequestURI();
        System.out.println("请求路径: " + uri);
        // 3、获取请求协议
        String protocol = request.getProtocol();
        System.out.println("请求协议: " + protocol);
        // 4、获取请求参数
        String name = request.getParameter("name");
        System.out.println("请求参数name: " + name);
        // 5、获取请求头 Accept
        String header = request.getHeader("Accept");
        System.out.println("请求头 Accept: " + header);

        return "OK";
    }
}
