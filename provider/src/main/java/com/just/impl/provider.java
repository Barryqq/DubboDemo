package com.just.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class provider {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("provider.xml");

        System.out.println("服务启动");
        content.start();
        System.out.println("服务启动成功");

        System.in.read();


    }
}
