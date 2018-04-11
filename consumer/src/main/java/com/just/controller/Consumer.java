package com.just.controller;

import com.just.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        context.start();
        System.out.println("consumer start");

        DemoService demoService = (DemoService)context.getBean("DemoService");

        System.out.println("consumer ing");
        System.out.println(demoService.getStr("调用远程方法成功"));


    }
}
