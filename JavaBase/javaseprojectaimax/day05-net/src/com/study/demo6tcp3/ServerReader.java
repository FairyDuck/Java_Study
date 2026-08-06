package com.study.demo6tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends  Thread{
    private Socket socket;
    public ServerReader(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            // 读取管道中的i西南西
            // 获取输入流，读取数据
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while( true) {
                String data = dis.readUTF();
                System.out.println("data: " + data);
                System.out.println("发送端的ip: " + socket.getInetAddress().getHostAddress());
                System.out.println("发送端的port: " + socket.getPort());
                System.out.println("-------------------------");
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("客户端断开连接...");
        }
    }
}
