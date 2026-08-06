package com.study.demo3udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    static void main(String[] args) throws IOException {
        // 实现UDP通信的多发多收，客户端开发
        System.out.println("客户端启动...");
        // 1、创建发送端
        DatagramSocket socket = new DatagramSocket(); // 发送端随机端口
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String data = sc.next();
            if("exit".equals(data)) {
                System.out.println("客户端退出...");
                socket.close();
                break;
            }
            // 2、创建数据包对象封装要发送的数据
            byte[] bytes = data.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8080);

            // 3、发送数据
            socket.send(packet);
        }
    }
}
