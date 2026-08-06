package com.study.demo4tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo2 {
    static void main(String[] args) throws IOException {
        System.out.println("启动服务端...");
        // 实现TCP通信一发一收，服务端开发
        // 1、创建一个服务器Socket，绑定监听端口
        ServerSocket serverSocket = new ServerSocket(9999);
        // 2、调用accept方法，阻塞等待客户端连接
        Socket socket = serverSocket.accept(); // 阻塞等待
        // 3、获取输入流
        InputStream is = socket.getInputStream();
        // 4、包装成特殊数据输入流
        DataInputStream dis = new DataInputStream(is);
        // 5、读取数据
        int id = dis.readInt();
        String data = dis.readUTF();
        System.out.println("id: " + id);
        System.out.println("data: " + data);
        // 6、获取发送端的ip和port
        System.out.println("发送端的ip: " + socket.getInetAddress().getHostAddress());
        System.out.println("发送端的port: " + socket.getPort());
    }
}
