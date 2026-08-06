package com.study.demo6tcp3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo2 {
    static void main(String[] args) throws IOException {
        System.out.println("启动服务端...");
        // 实现TCP通信多发多收，支持多客户的服务端开发
        // 1、创建一个服务器Socket，绑定监听端口
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true) {
            // 2、调用accept方法，阻塞等待客户端连接
            Socket socket = serverSocket.accept(); // 阻塞等待
            // 3、把这个客户端管道交给一个专门的线程处理
            new ServerReader(socket).start();
        }
    }
}
