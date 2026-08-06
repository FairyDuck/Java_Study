package com.study.demo2udp1;

import java.io.IOException;
import java.net.*;

public class UDPClientDemo1 {
    static void main(String[] args) throws IOException {
        // 实现UDP通信的一发一收，客户端开发
        System.out.println("客户端启动...");
        // 1、创建发送端
        DatagramSocket socket = new DatagramSocket();
        // 2、创建数据包对象封装要发送的数据
        byte[] bytes = "hello, UDP".getBytes();
        /*
        * 参数1  数据
        * 参数2  数据长度
        * 参数3  接收方地址
        * 参数4  接收方端口
        * */
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8080);

        // 3、发送数据
        socket.send(packet);
    }
}
