package com.study.demo3udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    static void main(String[] args) throws IOException {
        // 实现UDP通信的多发多收，服务端开发
        System.out.println("启动服务端...");
        // 1、创建接收端对象，注册端口
        DatagramSocket socket = new DatagramSocket(8080); // 接收端口
        // 2、创建数据包对象，封装接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        while (true) {
            // 3、接收数据
            socket.receive(packet);
            // 4、解析数据
            System.out.println("数据为：" + new String(packet.getData(), 0, packet.getLength()));
            // 5、获取发送方地址
            System.out.println("发送方地址为：" + packet.getAddress().getHostAddress());
            System.out.println("发送方端口为：" + packet.getPort());
            System.out.println("-------------------------");
        }
    }
}
