package com.study.demo6tcp3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientDemo1 {
    static void main(String[] args) throws IOException {
        System.out.println("客户端启动...");
        // 实现TCP通信多发多收，客户端开发
        // 1、常见的Socket管道对象，请求与服务端的Socket连接，可靠连接
        Socket socket = new Socket("127.0.0.1", 9999);

        // 2、从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();

        // 3、特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入数据:");
            String data = sc.nextLine();
            if("exit".equals(data)) {
                System.out.println("客户端退出...");
                dos.close(); // 关闭输出流
                socket.close(); // 关闭socket管道
                break;
            }
            dos.writeUTF(data);
            dos.flush(); // 刷新数据
        }
    }
}
