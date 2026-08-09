package com.study;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {

    // 通常情况下，响应状态码和响应头都是由SpringMVC自动设置的

    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        // 1、设置响应状态码
        response.setStatus(200);
        // 2、设置响应头
        response.setHeader("Content-Type", "text/html");
        response.setHeader("Content-Length", "1024");
        // 3、设置响应体
        response.getWriter().write("hello world");
    }

    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        return ResponseEntity
                .status(200)
                .header("headerName", "headerValue")
                .body("hello world");
    }
}
