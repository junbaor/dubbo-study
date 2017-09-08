package com.junbaor.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.ServerSocket;

/**
 * Created by junbaor on 2017/7/3.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
        context.start();

        /* 维持 spring 容器 */
        try {
            ServerSocket serverSocket = new ServerSocket(60001);
            while (true) {
                serverSocket.accept();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
