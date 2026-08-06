package com.study.demo1inetAddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    static void main(String[] args) {
            // 认识InetAddress获取本机IP对象和对方IP对象
            try {
                // 1、获取本机IP对象
                InetAddress localHost = InetAddress.getLocalHost();
                System.out.println(localHost.getHostAddress());
                System.out.println(localHost.getHostName());
                // 2、获取对方IP对象
                InetAddress host1 = InetAddress.getByName("www.baidu.com");
            System.out.println(host1.getHostAddress());
            System.out.println(host1.getHostName());
            // 3、判断主机与对方主机是否互通
            boolean reachable = host1.isReachable(5000); // ping
            System.out.println(reachable);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
